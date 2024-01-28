package Revision.OOPS;

public class DynamicArrayClass {
    public static void main(String[] args) {
        DynamicArray d1 = new DynamicArray();
        for (int i=1;i<100;i++){
            d1.add(100+i);
        }
        System.out.println(d1.size());
        System.out.println(d1.get(2));
        d1.set(3, 170);
        System.out.println(d1.get(3));
        d1.adds(6,199);
        System.out.println(d1.get(6));

        while(!d1.isEmpty()){
            System.out.println("elementRemoved:" +d1.removeLast()+" size : "+ d1.size());
        }

    }
}
