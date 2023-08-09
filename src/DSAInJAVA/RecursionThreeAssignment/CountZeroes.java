package DSAInJAVA.RecursionThreeAssignment;

public class CountZeroes {
    public static void main(String[] args) {
        int input = 10;
        System.out.println(countZerosRec(input));
    }

    private static int countZerosRec(int input) {
        if(input==0){
            return 1;
        }
        if(input<10){
        return 0;
        }
        if(input%10==0){
            return 1+countZerosRec(input/10);
        }
        else{
            return countZerosRec(input/10);
        }

    }
}
