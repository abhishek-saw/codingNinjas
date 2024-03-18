package DSAInJAVA.Stacks;

import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
        String expression = ")()()(";
        System.out.println(isBalanced(expression));
        System.out.println(isBracketBalanced(expression));

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
