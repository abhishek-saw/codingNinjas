package DSAInJAVA.Stacks;

import java.util.Objects;
import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        String expression = "{}";
        System.out.println(isBalanced(expression));
    }

    private static boolean isBalanced(String expression) {
        if(expression.isEmpty()){
            return true;
        }
        boolean isBoolean = true;
        Stack<Character> stacks = new Stack<>();
        for(int i = 0;i<expression.length();i++){
            char c1 = expression.charAt(i);
            if(c1=='[' ||c1=='{' ||c1=='('){
                stacks.push(c1);
            } else if (stacks.isEmpty()) {
                return false;
            } else {
                if(c1==')' || c1=='}' || c1==']'){
                    stacks.pop();
                }
                else {
                    return false;
                }
            }
        }
        if(!stacks.isEmpty()){
            return false;
        }
        return isBoolean;
    }
}
