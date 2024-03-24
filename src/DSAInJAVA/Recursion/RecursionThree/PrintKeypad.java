package DSAInJAVA.Recursion.RecursionThree;

public class PrintKeypad {
    public static void main(String[] args) {
        printKeypad(23,"");
    }
    private static void printKeypad(int n, String stringSoFar) {
        if(n==0){
            System.out.println(stringSoFar);
            return;
        }
        String [] reqString = getOptions(n%10);
        for (String s : reqString) {
            printKeypad(n / 10, s + stringSoFar);
        }
    }
    private static String[] getOptions(int lastDigit) {
        if (lastDigit == 2) {
            return new String[]{"a","b","c"};
        } else if (lastDigit == 3) {
            return new String[]{"d","e","f"};
        } else if (lastDigit == 4) {
            return new String[]{"g","h","i"};
        } else if (lastDigit == 5) {
            return new String[]{"j","k","l"};
        } else if (lastDigit == 6) {
            return new String[]{"m","n","o"};
        } else if (lastDigit == 7) {
            return new String[]{"p","q","r","s"};
        } else if (lastDigit == 8) {
            return new String[]{"t","u","v"};
        } else if (lastDigit == 9) {
            return new String[]{"w","x","y","z"};
        }
        return new String[]{""};
    }
}
