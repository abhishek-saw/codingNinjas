package DSAInJAVA.Stacks;

import java.util.Stack;

public class StackSpan {
//    Amit has been working with an organization called 'Money Traders' for the past few years.
//    The organization is into the money trading business. His manager assigned him a task.
//    For a given array/list of stock's prices for N days, find the stock's span for each day.
//    The span of the stock's price today is defined as the maximum number of consecutive days(starting
//    from today and going backwards) for which the price of the stock was less than today's price.
//    For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85],
//    then the stock spans will be [1, 1, 1, 2, 1, 4, 6].
//    Explanation:
//    On the sixth day when the price of the stock was 75, the span came out to be 4, because the
//    last 4 prices(including the current price of 75) were less than the current or the sixth day's price.
//    Similarly, we can deduce the remaining results.
//    Amit has to return an array/list of spans corresponding to each day's stock's price.
//    Help him to achieve the task.
//Constraints:
//0 <= N <= 10^7
//1 <= X <= 10^9
//Where X denotes the stock's price for a day.
//
//Time Limit: 1 second
//Sample Input 1:
//4
//10 10 10 10
//Sample Output 1:
//1 1 1 1
//Sample Input 2:
//8
//60 70 80 100 90 75 80 120
//Sample Output 2:
//1 2 3 4 1 1 2 8

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] price2 = {10,10,10,10};

        int [] result = stockSpan(price2);
        for(int i : result){
            System.out.print(i + " ");
        }
    }

    private static int[] stockSpan(int[] price) {
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int[price.length];
        for(int i = price.length-1;i>=0;i--){
            stack.push(price[i]);
        }
        int count = 1;
        for(int j = 0;j < price.length;j++){
            int m = stack.peek();
            for(int k = j-1;k>=0;k--){
                if(m>price[k]){
                    count++;
                }
                else {
                    break;
                }
            }
            ans[j] = count;
            count = 1;
            stack.pop();
        }
        return ans;
    }
}
