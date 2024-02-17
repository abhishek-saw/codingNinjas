package DSAInJAVA.Stacks;

import java.util.Stack;

public class ReverseStackRecursion {
    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        Stack<Integer> extra = new Stack<>();
        int [] arr = {1,2,3,4,5,7};
        for (int j : arr) {
            input.push(j);
        }
        reverseStackRecursion(input,extra);
        System.out.println(input.peek());
    }

    private static void reverseStackRecursion(Stack<Integer> input, Stack<Integer> extra) {
        if(input.isEmpty() || input.size()==1){
            return;
        }
       int temp = input.pop();
       reverseStackRecursion(input,extra);
       while (!input.isEmpty()){
           extra.push(input.pop());
       }
       input.push(temp);
       while (!extra.isEmpty()){
           input.push(extra.pop());
       }
    }
}
