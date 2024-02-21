package DSAInJAVA.Queues;


import java.util.Stack;

public class QueuesUsingTwoStacks<T> {
    private Stack<T> s1;
    private Stack<T> s2;
    public QueuesUsingTwoStacks(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public int size(){
        return s1.size();
    }
    public boolean isEmpty(){
        return s1.isEmpty();
    }
    public void enqueue(T element){
       if(s1.isEmpty()){
           s1.push(element);
       }
       else{
           while(!s1.isEmpty()){
               s2.push(s1.pop());
           }
           s1.push(element);
           while(!s2.isEmpty()){
               s1.push(s2.pop());
           }
       }
    }
    public T dequeue() throws QueueEmptyException {
        if(s1.isEmpty()){
            throw new QueueEmptyException();
        }
        else{
            return s1.pop();
        }
    }
    public T front() throws QueueEmptyException {
        if(s1.isEmpty()){
            throw new QueueEmptyException();
        }
        else{
            return s1.peek();
        }
    }

}
