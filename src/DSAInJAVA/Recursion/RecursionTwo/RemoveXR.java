package DSAInJAVA.Recursion.RecursionTwo;

public class RemoveXR {
    public static void main(String[] args) {
        System.out.println(removeX("xaxb"));
    }

    private static String removeX(String input) {
        if(input.length()==0){
            return input;
        }
        String smallInput = removeX(input.substring(1));
        if(input.charAt(0)=='x'){
            return smallInput;
        }
        return input.charAt(0) + smallInput;
    }
}
