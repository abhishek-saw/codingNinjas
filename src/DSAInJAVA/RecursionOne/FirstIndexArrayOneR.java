package DSAInJAVA.RecursionOne;

public class FirstIndexArrayOneR {
    public static int firstIndex(int input[], int x) {
        if(input.length==0){
            return -1;
        }
        if(input[0]==x){
            return 0;
        }

        int smallArray[] = new int[input.length-1];
        for(int i = 1;i<input.length-1;i++){
            smallArray[i-1] = input[i];
        }
        int index = firstIndex(smallArray,x);
        if(index==-1){
            return -1;
        }
        else{
            return index+1;
        }
    }
        public static void main(String[] args) {
            int [] arr = {1,3,3,4,4,6,4};
            System.out.println(firstIndex(arr,6));
    }
}
