package DSAInJAVA.Stacks;

import java.util.Stack;

public class MinimumBracketReversal {
    public static void main(String[] args) {
        String input = "}}}{{{";
        System.out.println(minimumBracketReversal(input));
    }

    private static int minimumBracketReversal(String input) {
        if(input.isEmpty()) {
            return 0;
        }
        if(input.length()%2!=0){
            return -1;
        }
        Stack<Character> stacks = new Stack<>();
        for(int i =0;i<input.length();i++){
            char currChar = input.charAt(i);
            if(currChar=='{'){
                stacks.push(currChar);
            } else {
                if(!stacks.isEmpty() && stacks.peek()=='{'){
                    stacks.pop();
                } else {
                    stacks.push(currChar);
                }
            }
        }
        int count = 0;
        while(!stacks.isEmpty()){
            char c1 = stacks.pop();
            char c2 = stacks.pop();
            if(c1==c2){
                count++;
            }
            else{
                count+=2;
            }
        }

        return count;
    }
}
