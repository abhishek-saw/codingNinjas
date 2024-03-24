package DSAInJAVA.Recursion.RecursionThree;

public class SubsequencesPrint {
    public static void main(String[] args) {
        String string = "abc";
        printsSubsequences(string,"");
    }
    private static void  printsSubsequences(String string, String stringSoFar) {
        if(string.isEmpty()){
            System.out.println(stringSoFar);
            return;
        }
        printsSubsequences(string.substring(1), stringSoFar);
        printsSubsequences(string.substring(1),stringSoFar + string.charAt(0));
    }
}
