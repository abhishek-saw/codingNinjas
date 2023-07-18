package DSAInJAVA.RecursionOne;

public class LastIndexArrayThreeR {
    public static int lastIndex(int input[], int x,int si) {
        if(si==input.length) {//base case
            return -1;
        }

        int index =  lastIndex(input,x,si+1);
        if(index !=-1) {
            return index;
        }
        else{
            if(input[si]==x){
                return si;
            }
            else{
                return -1;
            }
        }
    }
        public static void main(String[] args) {
            int [] arr = {1,2,4,3,4,4,1,1};
            System.out.println(lastIndex(arr,4,0));
    }
}
