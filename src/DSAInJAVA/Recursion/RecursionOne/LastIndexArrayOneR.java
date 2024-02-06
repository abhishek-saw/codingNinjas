package DSAInJAVA.Recursion.RecursionOne;

public class LastIndexArrayOneR {
    public static int lastIndex(int input[], int x) {
        if(input.length==0)//base case
        return -1;

        if(input[input.length-1]==x){
            return input.length-1;
        }

        int[] smallArray = new int[input.length-1];
        for(int i = 0;i<input.length-1;i++){
            smallArray[i] = input[i];
        }
        return lastIndex(smallArray,x);
    }
        public static void main(String[] args) {
            int [] arr = {1,2,4,3,4,4,1,1};
            System.out.println(lastIndex(arr,4));
    }
}
