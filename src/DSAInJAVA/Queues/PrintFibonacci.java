package DSAInJAVA.Queues;

public class PrintFibonacci {
    public static void main(String[] args) throws Exception {
        int n = 5;
        printFib(n);
    }

    private static void printFib(int n) throws Exception {
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        queueUsingArray.enqueue(0);
        queueUsingArray.enqueue(1);
        for (int i = 0; i < n; i++) {
            int a = queueUsingArray.dequeue();
            int b = queueUsingArray.dequeue();
            queueUsingArray.enqueue(b);
            queueUsingArray.enqueue(a + b);
            System.out.print(a+" ");
        }
    }
}
