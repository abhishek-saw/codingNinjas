package Revision.OOPS.Generics;

import java.util.Arrays;

public class GenericMethod {
    public static<T> void printArray(T[] arr){
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();

    }
    public static<T extends PrintInterface> void printArray2(T[] arr){
        for (T t : arr) {
            t.print();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer [] arr = new Integer[5];
        for(int i =0;i<arr.length;i++){
            arr[i] = i+1;
        }
        printArray(arr);

        String [] str = new String[5];
        Arrays.fill(str, "abc");
        printArray(str);

        Vehicle [] veh = new Vehicle[5];
        for(int i =0;i<veh.length;i++) {
            veh[i] = new Vehicle("BMW",50+i);
        }
        printArray2(veh);


        Student [] students = new Student[5];
        for(int i = 0;i<students.length;i++){
            students[i] = new Student(i+1);
        }
        printArray2(students);
    }
}
