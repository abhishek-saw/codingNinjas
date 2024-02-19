package DSAInJAVA.Stacks;

import java.util.Stack;

public class CheckRedundantBrackets {
    public static void main(String[] args) {
        String expression = "(a+b*((a/c-d)))";
        System.out.println(checkRedundantBrackets(expression));

    }

    private static boolean checkRedundantBrackets(String expression) {
        if(expression.isEmpty()){
            return false;
        }
        int count=0;
        Stack<Character> stackExp = new Stack<>();
        for(int i =0;i<expression.length();i++){
            if(expression.charAt(i)!=')') {
                stackExp.push(expression.charAt(i));
            }
            else{
               count =0;
                while(stackExp.peek()!='(' && !stackExp.isEmpty()){
                    stackExp.pop();
                    count++;
                }
                stackExp.pop();
                if(count<2){
                    return true;
                }
            }
        }
        return false;
    }
}
