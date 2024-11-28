package lab3;

import oop.practice3.ArrayQueue;
import oop.practice3.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTests {

    private Queue<Integer> arrayQueue;

    @BeforeEach
    public void setUp() {
        arrayQueue = new ArrayQueue<>(5);  // Initialize with capacity 5
    }

    @Test
    public void testPushAndPop() {
        arrayQueue.push(1);
        arrayQueue.push(2);
        arrayQueue.push(3);

        assertEquals(1, arrayQueue.pop(), "pop should return the first pushed item");
        assertEquals(2, arrayQueue.pop(), "pop should return the second pushed item");
        assertEquals(3, arrayQueue.pop(), "pop should return the third pushed item");

        assertTrue(arrayQueue.isEmpty(), "Queue should be empty after all items are popped");
    }

    @Test
    public void testPeek() {
        arrayQueue.push(10);
        assertEquals(10, arrayQueue.peek(), "Peek should return the first item without removing it");

        arrayQueue.push(20);
        assertEquals(10, arrayQueue.peek(), "Peek should still return the first item");

        arrayQueue.pop();
        assertEquals(20, arrayQueue.peek(), "Peek should update to the next item after a pop");
    }

    @Test
    public void testIsEmpty() {
        assertTrue(arrayQueue.isEmpty(), "Queue should initially be empty");

        arrayQueue.push(1);
        assertFalse(arrayQueue.isEmpty(), "Queue should not be empty after push");

        arrayQueue.pop();
        assertTrue(arrayQueue.isEmpty(), "Queue should be empty after all items are popped");
    }

    @Test
    public void testIsFull() {
        arrayQueue.push(1);
        arrayQueue.push(2);
        arrayQueue.push(3);
        arrayQueue.push(4);

        assertFalse(arrayQueue.size() == 5, "Queue should not be full before reaching capacity");

        arrayQueue.push(5);
        assertEquals(5, arrayQueue.size(), "Queue should be full after reaching capacity");

        assertThrows(IllegalStateException.class, () -> arrayQueue.push(6), "Pushing into a full queue should throw");
    }

    @Test
    public void testBoundaryConditions() {
        // Pop from an empty queue
        assertThrows(IllegalStateException.class, arrayQueue::pop, "pop should throw when queue is empty");

        // Peek from an empty queue
        assertThrows(IllegalStateException.class, arrayQueue::peek, "Peek should throw when queue is empty");

        // Fill the queue and ensure capacity is respected
        arrayQueue.push(1);
        arrayQueue.push(2);
        arrayQueue.push(3);
        arrayQueue.push(4);
        arrayQueue.push(5);
        assertThrows(IllegalStateException.class, () -> arrayQueue.push(6), "push should throw when queue is full");

        // Ensure size is consistent
        assertEquals(5, arrayQueue.size(), "Queue size should reflect the number of items");

        // Clear the queue and ensure it is empty
        arrayQueue.clear();
        assertTrue(arrayQueue.isEmpty(), "Queue should be empty after clear");
    }
}
