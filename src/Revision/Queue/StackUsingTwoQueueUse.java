package Revision.Queue;

public class StackUsingTwoQueueUse {
    public static void main(String[] args) {
        StackUsingTwoQueue stackUsingLL = new StackUsingTwoQueue();
        int[] arr3 = {5,6,7,1,9};
        for(Integer integer: arr3){
            stackUsingLL.push(integer);
        }
        System.out.println(stackUsingLL.isEmpty());
        System.out.println(stackUsingLL.top());
        System.out.println(stackUsingLL.size());
        System.out.println(stackUsingLL.pop());
        System.out.println(stackUsingLL.size());
        System.out.println(stackUsingLL.top());
        System.out.println(stackUsingLL.pop());
        System.out.println(stackUsingLL.size());
    }
}