package DSAInJAVA.Recursion.RecursionTwo.RecursionAssignment;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println(sum);
    }

    private static int sumOfDigits(int input) {
        if (input == 0) {
            return 0;
        }
        return  input%10 +  sumOfDigits(input/10);

    }
}
