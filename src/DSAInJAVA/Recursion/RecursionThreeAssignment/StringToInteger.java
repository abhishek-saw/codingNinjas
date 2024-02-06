package DSAInJAVA.Recursion.RecursionThreeAssignment;

public class StringToInteger {
    public static void main(String[] args) {
        String input = "12345" ;
        int result = stringToInteger(input);
        System.out.println(result);

    }
    private static int stringToInteger(String input) {
        if(input.length()==1){
            return input.charAt(0) -'0';
        }
        return stringToInteger(input.substring(0,input.length()-1))*10 +(input.charAt(input.length()-1) -'0'); // smallCal + last digit
    }
}
