package DSAInJAVA.RecursionThreeAssignment;

public class CheckAB {
    public static void main(String[] args) {
        String input = "abbaabb";
        System.out.print(checkAB(input));
    }
private static boolean checkAB(String input) {
        if(input.isEmpty()){
            return true;
        }
        if(input.charAt(0)=='a') {
            if (input.substring(1).length() > 1 && input.startsWith("bb", 1)) {
                return checkAB(input.substring(3));
            } else {
                return checkAB(input.substring(1));
            }
        }
        return false;
    }
}
