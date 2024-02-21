package DSAInJAVA.Queues;

import DSAInJAVA.Stacks.StackEmptyException;

public class StackUsingTwoQueuesUse {
    public static void main(String[] args) throws StackEmptyException {
        StackUsingTwoQueues<Integer> stackUsingLL = new StackUsingTwoQueues<>();
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
