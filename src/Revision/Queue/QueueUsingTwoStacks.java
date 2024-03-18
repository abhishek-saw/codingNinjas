package Revision.Queue;

import java.util.Stack;

public class QueueUsingTwoStacks<T> {
    private final Stack<T> front;
    private final Stack<T> rear;
    QueueUsingTwoStacks(){
        front = new Stack<>();
        rear = new Stack<>();
    }
    public int size(){
        return front.size();
    }
    public boolean isEmpty(){
        return front.isEmpty();
    }
    public void enqueue(T data){
        if(front.isEmpty()){
            front.push(data);
        }
        else {
            while(!front.isEmpty()){
                rear.push(front.pop());
            }
            front.push(data);
            while (!rear.isEmpty()){
                front.push(rear.pop());
            }
        }
    }
    public T dequeue(){
        return front.pop();
    }
    public T peek(){
        return front.peek();
    }
}
