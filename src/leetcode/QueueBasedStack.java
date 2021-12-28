package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasedStack {
    Queue<Integer> queue;
    Queue<Integer> copyQueue;
    Integer top = null;
    public QueueBasedStack() {
        queue = new LinkedList<>();
        copyQueue = new LinkedList<>();
    }

    public void push(int x) {
        top = x;
        queue.add(x);
    }

    public int pop() {
        Integer lastElement = null;
        while(queue.size() > 1){
            top = queue.remove();
            copyQueue.add(top);
        }
        lastElement = queue.remove();
        Queue<Integer> temp = queue;
        queue = copyQueue;
        copyQueue = temp;
        return lastElement;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
