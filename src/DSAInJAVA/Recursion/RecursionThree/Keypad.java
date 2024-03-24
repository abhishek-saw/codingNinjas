package DSAInJAVA.Recursion.RecursionThree;

import java.util.Scanner;

public class Keypad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] answer = keypad(n);
        for (String string : answer) {
            System.out.println(string);
        }
    }

    private static String[] keypad(int n) {
        if (n == 0 || n == 1) {
            return new String[]{""};
        }
        String[] smallOutput = keypad(n / 10);
        String[] lastDigitOptions = getOptions(n % 10);
        String[] answer = new String[lastDigitOptions.length * smallOutput.length];
        int m = 0;
        for (String s : smallOutput) {
            for (String lastDigitOption : lastDigitOptions) {
                answer[m] = s + lastDigitOption;
                m++;
            }
        }
        return answer;
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
