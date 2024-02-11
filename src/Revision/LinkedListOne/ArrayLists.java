package Revision.LinkedListOne;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));

        arrayList.add(1,80);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));

        arrayList.remove(2);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));

        Integer i = 10;
        arrayList.remove(i);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));

        arrayList.set(0,100);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));

        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
    }
}
