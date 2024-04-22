package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

public class CountWaysToMakeChangeRecursion {
    public static void main(String[] args) {
        int [] denominations = {1,2,3};
        int value = 4;
        System.out.println(countWaysToMakeChange(denominations,value));
    }

    private static int countWaysToMakeChange(int[] denominations, int value) {
        int index =0;
        return countWaysToMakeChangeHelper(denominations,value,index);
    }

    private static int countWaysToMakeChangeHelper(int[] denominations, int value, int index) {
        if (value<0||index >= denominations.length) {
            return 0;
        }
        if (value== 0 ) {
            return 1;
        }
        return countWaysToMakeChangeHelper(denominations,value-denominations[index],index) +
                countWaysToMakeChangeHelper(denominations,value-denominations[index],index+1);
    }
}
