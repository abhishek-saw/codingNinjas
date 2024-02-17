package DSAInJAVA.Stacks;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        System.out.println("StackUsingArray");
        StackUsingArray stackArray = new StackUsingArray();
        stackArray.push(10);
        System.out.println(stackArray.top());
        stackArray.push(20);
        System.out.println(stackArray.pop());
        System.out.println(stackArray.size());
        System.out.println(stackArray.isEmpty());
        int[] arr = {5,6,7,1,9};
        for(Integer integer: arr){
            stackArray.push(integer);
        }
        System.out.println(stackArray.top());
        System.out.println(stackArray.size());
        while(!stackArray.isEmpty()){
            System.out.print(stackArray.pop()+ " ");
        }
        System.out.println();
        System.out.println("StackArrayWithoutException");
        StackArrayWithoutException stackArray2 = new StackArrayWithoutException();
        int[] arr2 = {5,6,7,1,9};
        for(Integer integer: arr2){
            stackArray2.push(integer);
        }
        System.out.println(stackArray2.top());
        System.out.println(stackArray2.size());

        System.out.println("StackUsingLL");
        StackUsingLL<Integer> stackUsingLL = new StackUsingLL<>();
        int[] arr3 = {5,6,7,1,9};
        for(Integer integer: arr3){
            stackUsingLL.push(integer);
        }
        System.out.println(stackUsingLL.isEmpty());
        System.out.println(stackUsingLL.top());
        System.out.println(stackUsingLL.size());
        System.out.println(stackUsingLL.pop());
        System.out.println(stackUsingLL.size());
        System.out.println(stackUsingLL.top());
        System.out.println(stackUsingLL.pop());
        System.out.println(stackUsingLL.size());
    }
}
