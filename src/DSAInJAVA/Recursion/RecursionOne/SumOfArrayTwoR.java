package DSAInJAVA.Recursion.RecursionOne;

public class SumOfArrayTwoR {
    public static int sum(int input[]) {
        if(input.length==1){
            return input[0];
        }
        int smallSum = input[0] + input[1];

        int smallArray[] = new int[input.length-1];
        for(int i = 2;i<input.length;i++){
            smallArray[i-1] = input[i];
        }

        int smallOutput  = sum(smallArray);

        return smallSum + smallOutput;
    }
        public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(sum(arr));
    }
}
