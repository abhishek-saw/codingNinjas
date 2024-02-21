package DSAInJAVA.Queues;

import DSAInJAVA.Stacks.StackEmptyException;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues<T> {
    private Queue<T> q1;
    private Queue<T> q2;

    public StackUsingTwoQueues(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public int size(){
        return q1.size();
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }
    public void push(T element){
        if(q1.isEmpty()){
            q1.add(element);
            return;
        }
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        q1.add(element);
        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
    }
    public T pop() throws StackEmptyException {
        if(q1.isEmpty()){
            throw  new StackEmptyException();
        }
        return q1.poll();
    }
    public T top() throws StackEmptyException {
        if(q1.isEmpty()){
            throw new StackEmptyException();
        }
        return q1.peek();
    }
}
