package DSAInJAVA.Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> extra = new Stack<>();
        int [] arr1 = {1,2,3,4,5,6,7};
        for (int j : arr1) {
            input.push(j);
        }
        reverseStack(input,extra);
        System.out.println(input.peek());
//        Stack<Integer> input2 = new Stack<>();
//        int [] arr2 = {7};
//        for (int j : arr2) {
//            input2.push(j);
//        }
//        reverseStack(input2,extra);
//        for (int j : arr2) {
//            System.out.print(input2.pop()+" ");
//        }
    }

    private static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        Stack<Integer> extra2 = new Stack<>();
        while(!input.isEmpty()){
            extra.push(input.pop());
        }
        while(!extra.isEmpty()){
            extra2.push(extra.pop());
        }
        while(!extra2.isEmpty()){
            input.push(extra2.pop());
        }
    }
}
