package DSAInJAVA.Recursion.RecursionOne;

public class LastIndexArrayFourR {
    public static int lastIndex(int input[], int x) {
        if(input.length==0) {//base case
            return -1;
        }

        int[] smallArray = new int[input.length-1];
        for(int i = 1;i<input.length-1;i++){
            smallArray[i-1] = input[i];
        }
        int index =  lastIndex(smallArray,x);

        if(index !=-1) {
            return index + 1;
        }
        else{
            if(input[0]==x){
                return 0;
            }
            else{
                return -1;
            }
        }
    }
        public static void main(String[] args) {
            int [] arr = {1,2,4,3,4,4,1,1};
            System.out.println(lastIndex(arr,4));
    }
}
