package Revision.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
    Queue<Integer> q1 ;
    Queue<Integer> q2 ;
    StackUsingTwoQueue(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public int size(){
        return q1.size();
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    public int top(){
        if(!q1.isEmpty()){
        return q1.peek();
        }
        else return -1;
    }
    public void push(int element){
        if(q1.isEmpty()){
            q1.add(element);
            return;
        }
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(element);
        while (!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }
    public int pop() {
        int element = -1;
        if (!q1.isEmpty()) {
            element = q1.poll();
        }
        return element;
    }
}
