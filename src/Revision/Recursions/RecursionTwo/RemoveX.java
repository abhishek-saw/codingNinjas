package Revision.Recursions.RecursionTwo;

public class RemoveX {
    public static void main(String[] args) {
        System.out.println(removeX("xfcxfcdxsx"));
    }
    public static String removeX(String input){
        if(input.isEmpty()){
            return input;
        }
        if (input.charAt(0) == 'x') {
           return removeX(input.substring(1));
        }
        else {
            return input.charAt(0)+removeX(input.substring(1));
        }
    }
}
