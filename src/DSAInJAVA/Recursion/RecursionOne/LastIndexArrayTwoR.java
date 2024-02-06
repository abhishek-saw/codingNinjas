package DSAInJAVA.Recursion.RecursionOne;

public class LastIndexArrayTwoR {
    public static int lastIndex(int input[], int x,int si) {
        if(si==-1)//base case
        return -1;

        if(input[si-1]==x){
            return si;
        }
        return lastIndex(input,x,si-1);
    }
        public static void main(String[] args) {
            int [] arr = {1,2,4,3,4,4,1,1};
            System.out.println(lastIndex(arr,4,arr.length));
    }
}
