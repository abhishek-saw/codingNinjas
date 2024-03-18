package Revision.Stacks;

import java.util.Stack;

public class StackAssignment {
    public static void main(String[] args) {
        System.out.println("isBracketBalanced");
        String expression = ")()()(";
        System.out.println(isBracketBalanced(expression));
        System.out.println("reverseStack");
        Stack<Integer> input = new Stack<>();
        Stack<Integer> extra = new Stack<>();
        int [] arr1 = {1,2,3,4,5,6,7};
        for (int j : arr1) {
            input.push(j);
        }
        for(int i =arr1.length-1;i>=0;i--){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        reverseStack(input,extra);
        for (int ignored : arr1) {
            System.out.print(input.pop() + " ");
        }
        System.out.println();
        System.out.println("countBracketReversals");
        String input1 = "}}}{{{";
        System.out.println(countBracketReversals(input1));
        System.out.println("checkRedundantBrackets");
        String expression1 = "(x+y-(a*b))";
        System.out.println(checkRedundantBrackets(expression1));
        int[] price1 = {100, 80, 60, 70, 60, 75, 85};
        int[] price2 = {10,10,10,10};
        System.out.println("stockSpan");
        int [] result1 = stockSpan(price1);
        for(int i : result1){
            System.out.print(i + " ");
        }
        System.out.println();
        int [] result2 = stockSpan(price2);
        for(int i : result2){
            System.out.print(i + " ");
        }
    }
    private static int[] stockSpan(int[] price) {
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int[price.length];
        stack.push(0);
        ans[0] = 1;
        for(int i =1;i<price.length;i++){
            while(!stack.isEmpty() && price[stack.peek()]<price[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = i+1;
            }
            else {
                ans[i] = 1 - stack.peek();
            }
        }
        return ans;
    }
    private static boolean checkRedundantBrackets(String expression) {
        if(expression.isEmpty()){
            return true;
        }
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            char c = expression.charAt(i);
            if(c!=')'){
                stack.push(c);
            }
            else{
                count=0;
                if(!stack.isEmpty()){
                    while( stack.peek()!='(' &&!stack.isEmpty()) {
                        stack.pop();
                        count++;
                    }
                    stack.pop();
                    if (count < 2) {
                        return true;
                    }

                }
            }
        }
        return false;
    }
    private static int countBracketReversals(String input) {
        if(input.isEmpty()){
            return 0;
        }
        if(input.length()%2!=0){
            return -1;
        }
        Stack<Character> stringStack = new Stack<>();
        int i = 0;
        while(i<input.length()){
            char chars = input.charAt(i);
            if(chars=='{'){
                stringStack.push(chars);
            }
            else{
                if(!stringStack.isEmpty() && stringStack.peek() == '{') {
                    stringStack.pop();
                } else {
                    stringStack.push(chars);
                }
            }
            i++;
        }
        System.out.println(stringStack);
        int count=0;
        while(!stringStack.isEmpty()){
            char c1 = stringStack.pop();
            char c2 = stringStack.pop();
            if(c1==c2){
                count++;
            }
            else{
                count+=2;
            }
        }
        return count;
    }
    private static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        if(input.isEmpty()){
            return;
        }
        int temp = input.pop();
        reverseStack(input,extra);
        while(!input.isEmpty()){
            extra.push(input.pop());
        }
        input.push(temp);
        while(!extra.isEmpty()){
            input.push(extra.pop());
        }
    }
    private static boolean isBracketBalanced(String expression) {
        if(expression.isEmpty()){
            return true;
        }
        Stack<Character> characterStack = new Stack<>();
        int i = 0;
        while(i<expression.length()){
            char newChar = expression.charAt(i);
            if(newChar=='(' ||newChar=='{' || newChar=='[')
                characterStack.push(newChar);
            else{
                if(!characterStack.isEmpty()) {
                    char newChars = characterStack.peek();
                    if (newChars == '(' || newChars == '{' || newChars == '[')
                        characterStack.pop();
                    else {
                        characterStack.push(newChar);
                    }
                }
            }
            i++;
        }
        return characterStack.isEmpty();
    }
}
