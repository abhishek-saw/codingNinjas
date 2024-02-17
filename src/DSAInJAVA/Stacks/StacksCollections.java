package DSAInJAVA.Stacks;

import java.util.Stack;

public class StacksCollections {
    public static void main(String[] args) {
        // Behavior matters not how data is stored in memory
        // Its ADT : Abstract Data Type(Operation only matters)
        // e.g. stack of books
        // LIFO : LAST IN FIRST OUT
        // Insertion/Deletion only at top from Stacks
        // only one end is open and other end is fixed
        // Recursion is an example of Stack: Call stack
        // fact(3)->fact(2)->fact(1)->fact(0) : fact(O) is first executed
        // Basic Operation :
        // push() -> to insert at the top
        // top() -> to get first element from top
        // pop() -> to delete element from top
        // size() -> size of stack
        // isEmpty() -> Empty: true && Not Empty: false


        Stack<Integer> stacks = new Stack<>();
        stacks.push(10);
        System.out.println(stacks.size());
        System.out.println(stacks.peek());
        stacks.push(20);
        stacks.push(30);
        stacks.push(40);
        System.out.println(stacks.size());
        System.out.println(stacks.pop());
        System.out.println(stacks.size());
        System.out.println(stacks.isEmpty());
        System.out.println(stacks.firstElement());
        System.out.println(stacks.lastElement());
        System.out.println(stacks.peek());

        Stack<Integer> stacks2 = new Stack<>();
        int[] arr = {1,3,4,5,8,9};
        for(int num: arr){
            stacks2.push(num);
        }
        while(!stacks2.isEmpty()){
            System.out.print(stacks2.pop()+" ");
        }
    }
}
