package ImplementQueueUsingStask;


import java.util.ArrayDeque;

public class MyQueue {
    ArrayDeque<Integer> stack = new ArrayDeque<>();

    @Override
    public String toString() {
        return "MyQueue{" + stack + '}';
    }

    public void enqueue(Integer value) {
        ArrayDeque<Integer> tempStack = new ArrayDeque<>();
        while (stack.size() > 0) {
            tempStack.push(stack.pop());
        }
        stack.push(value);
        while (tempStack.size() > 0) {
            stack.push(tempStack.pop());
        }
    }

    public Integer dequeue() {
        return stack.pop();
    }
  public boolean isEmpty() {
        return stack.size() == 0;
    }

    public Integer peek() {
        return stack.peek();
    }
}





