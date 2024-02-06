package DSAInJAVA.OOPS.OOPSOne;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d= new DynamicArray();

        for(int i=1;i<10;i++){
            d.add(100+i);
        }
        System.out.println(d.size());
        System.out.println(d.get(2));
        d.set(3,170);
        System.out.println(d.get(3));

        d.addNew(4,160);
        System.out.println(d.get(4));
        //similarly remove

        while(!d.isEmpty()){
            System.out.println(d.removeLast());
            System.out.println("size- "+d.size());
        }
    }
}
