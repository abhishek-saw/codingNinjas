package DSAInJAVA.DynamicProgramming.DynamicProgrammingOne;

public class MaxMoneyLootedRecursion {
    public static void main(String[] args) {
        int [] arr1 = {5,5,10,100,10,5};
        int [] arr2 = {10,2,30,20,3,50};
        System.out.println(maxMoneyLooted(arr1));
        System.out.println(maxMoneyLooted(arr2));
    }
    private static int maxMoneyLooted(int[] houses) {
        return maxMoneyLootedHelper(houses,0,houses.length);
    }

    private static int maxMoneyLootedHelper(int[] houses, int i,int n) {
        if(i>=n){
            return 0;
        }
        int max1 = houses[i] + maxMoneyLootedHelper(houses,i+2, n);
        int max2 = maxMoneyLootedHelper(houses,i+1, n);
        return Math.max(max1,max2);
    }
}
