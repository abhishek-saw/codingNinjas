package DSAInJAVA.Recursion.RecursionOne;

public class CheckNumberInArrayR {
    public static boolean checkNumber(int input[], int x) {
        Boolean isBoolean  = false;
        if(input.length==0){
            return isBoolean;
        }
        if(input[0]==x){
            return true;
        }
        int smallArray[] = new int[input.length-1];
        for(int i = 1;i<input.length-1;i++){
            smallArray[i-1] = input[i];
        }

        boolean smallOutput = checkNumber(smallArray,x);
        isBoolean = smallOutput;
        return isBoolean;
    }
        public static void main(String[] args) {
            int [] arr = {1,2,3,4,5,6};
            System.out.println(checkNumber(arr,111));
    }
}
