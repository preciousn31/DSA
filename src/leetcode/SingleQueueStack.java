package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SingleQueueStack {
    Queue<Integer> queue;
    Integer top = null;
    public SingleQueueStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        top = x;
        queue.add(x);
    }

    public int pop() {
        /*Integer element = null;
        Integer tempTop = top;
        while(tempTop != element){
            element = queue.remove();
            if(tempTop != element) {
                top = element;
                queue.add(element);
            }

        }
        return element;*/
        int size = queue.size();
        while(size > 1){
            top = queue.remove();
            queue.add(top);
            size--;
        }
        return queue.remove();
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
