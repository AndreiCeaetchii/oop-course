package lab3;

import oop.practice3.ArrayQueue;
import oop.practice3.LinkedQueue;
import oop.practice3.Queue;
import oop.practice3.VectorQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTests {

    private Queue<Integer> arrayQueue;
    private Queue<Integer> vectorQueue;
    private Queue<Integer> linkedQueue;

    @BeforeEach
    public void setUp() {
        arrayQueue = new ArrayQueue<>(5);  // Initialize with capacity 5
        vectorQueue = new VectorQueue<>(5);
        linkedQueue = new LinkedQueue<>(5);
    }

    @Test
    public void testpushAndpop() {
        assertpushAndpop(arrayQueue);
        arrayQueue.clear();

        assertpushAndpop(vectorQueue);
        vectorQueue.clear();

        assertpushAndpop(linkedQueue);
        linkedQueue.clear();
    }

    @Test
    public void testPeek() {
        assertPeek(arrayQueue);
        arrayQueue.clear();

        assertPeek(vectorQueue);
        vectorQueue.clear();

        assertPeek(linkedQueue);
        linkedQueue.clear();
    }

    @Test
    public void testIsEmpty() {
        assertIsEmpty(arrayQueue);
        arrayQueue.clear();

        assertIsEmpty(vectorQueue);
        vectorQueue.clear();

        assertIsEmpty(linkedQueue);
        linkedQueue.clear();
    }

    @Test
    public void testIsFull() {
        assertIsFull(arrayQueue);
        arrayQueue.clear();

        assertIsFull(vectorQueue);
        vectorQueue.clear();
    }

    @Test
    public void testBoundaryConditions() {
        assertBoundaryConditions(arrayQueue);
        arrayQueue.clear();

        assertBoundaryConditions(vectorQueue);
        vectorQueue.clear();
    }

    private void assertpushAndpop(Queue<Integer> queue) {
        queue.push(1);
        queue.push(2);
        queue.push(3);

        assertEquals(1, queue.pop(), "pop should return the first pushd item");
        assertEquals(2, queue.pop(), "pop should return the second pushd item");
        assertEquals(3, queue.pop(), "pop should return the third pushd item");

        assertTrue(queue.isEmpty(), "Queue should be empty after all items are popd");
    }

    private void assertPeek(Queue<Integer> queue) {
        queue.push(10);
        assertEquals(10, queue.peek(), "Peek should return the first item without removing it");

        queue.push(20);
        assertEquals(10, queue.peek(), "Peek should still return the first item");

        queue.pop();
        assertEquals(20, queue.peek(), "Peek should update to the next item after a pop");
    }

    private void assertIsEmpty(Queue<Integer> queue) {
        assertTrue(queue.isEmpty(), "Queue should initially be empty");

        queue.push(1);
        assertFalse(queue.isEmpty(), "Queue should not be empty after push");

        queue.pop();
        assertTrue(queue.isEmpty(), "Queue should be empty after all items are popd");
    }

    private void assertIsFull(Queue<Integer> queue) {
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        assertFalse(queue.isFull(), "Queue should not be full before reaching capacity");

        queue.push(5);
        assertTrue(queue.isFull(), "Queue should be full after reaching capacity");

        assertThrows(IllegalStateException.class, () -> queue.push(6), "pushing into a full queue should throw");
    }

    private void assertBoundaryConditions(Queue<Integer> queue) {
        // pop from an empty queue
        assertThrows(IllegalStateException.class, queue::pop, "pop should throw when queue is empty");

        // Peek from an empty queue
        assertThrows(IllegalStateException.class, queue::peek, "Peek should throw when queue is empty");

        // Fill the queue and ensure capacity is respected
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        assertThrows(IllegalStateException.class, () -> queue.push(6), "push should throw when queue is full");

        // Ensure size is consistent
        assertEquals(5, queue.size(), "Queue size should reflect the number of items");

        // Clear the queue and ensure it is empty
        queue.clear();
        assertTrue(queue.isEmpty(), "Queue should be empty after clear");
    }
}