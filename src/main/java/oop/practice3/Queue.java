package oop.practice3;

public interface Queue<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
    boolean isFull();
    int size();
    void clear();
}
