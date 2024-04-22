package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

public class Knapsack01Recursion {
    public static void main(String[] args) {
//        int [] weights = {1,2,4,5};
//        int [] values = {5,4,8,6};
//        int n = weights.length;
//        int maxWeight = 5;
        int [] weights = {20,25,30};
        int [] values = {200,300,100};
        int n = weights.length;
        int maxWeight = 50;
        System.out.println(knapsack(weights,values,n,maxWeight));
    }
    public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
        return knapsackHelper(weights,values,0,n,maxWeight);
    }

    private static int knapsackHelper(int[] weights, int[] values, int i, int n, int maxWeight) {
        if(i==n){
            return 0;
        }
        int ans ;
        if(weights[i]<=maxWeight){
            int a = values[i] + knapsackHelper(weights,values,i+1,n,maxWeight-weights[i]);
            int b = knapsackHelper(weights,values,i+1,n,maxWeight);
            ans = Math.max(a,b);
        }
        else {
            ans = knapsackHelper(weights,values,i+1,n,maxWeight);
        }
        return ans;
    }
}
