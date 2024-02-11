package DSAInJAVA.LinkedList.LinkedListOneTwo;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
//        ArrayList<Integer> arr = new ArrayList<>(20);
        arr.add(10);
        arr.add(20);
        arr.add(200);
        arr.add(3,40);

        System.out.println(arr.get(2));
        System.out.println(arr.size());

        arr.remove(2);
        arr.set(2,1000);

        System.out.println(arr.get(2));
        System.out.println(arr.size());

        for(int i =0;i< arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        // For each loop or Enhanced for loop
        // for each element in arr and above was travelling over the induces of the arr
        for(int i : arr){
            System.out.print(i +" ");
        }
        ArrayList<String> list = new ArrayList<>() ;
        list.add( "apple" );
        list.add( "banana" );
        list.add( "carrot" );
        System.out.println("\n"+list.size());
        list.add( 0, "mango" );
        System.out.println(list.get(3));
        System.out.println(list.size());
    }
}
