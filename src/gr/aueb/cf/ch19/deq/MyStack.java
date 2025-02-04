package gr.aueb.cf.ch19.deq;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

/**
 * LIFO impl with Deque.
 */
public class MyStack<T> {
    private final Deque<T> myStack = new LinkedList<>();

    public MyStack() {
    }

    public Deque<T> getMyStack() {
        return myStack;
    }

    public void push(T t) {
        myStack.push(t);
    }

    public T pop() {
        return myStack.pop();
    }

    public void forEach(Consumer<T> action) {
        myStack.forEach(action);
    }
}
