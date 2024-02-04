package Revision.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
    /*
    The object of class BufferedReader is made static because it
    is being used by multiple functions.
    */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            int[] input = takeInput();
            printArray(input);
            t -= 1;
        }
    }
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine());
        int[] input = new int[size];
        if (size == 0) {
            return input;
        }
        String[] strNumb;
        strNumb = br.readLine().split("\\s");
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNumb[i]);
        }
        return input;
    }
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
