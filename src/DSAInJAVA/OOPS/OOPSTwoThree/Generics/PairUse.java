package DSAInJAVA.OOPS.OOPSTwoThree.Generics;

public class PairUse {
    public static void main(String[] args) {

        Pair p = new Pair(30, 40);
//        very, very dangerous, type of the p will be OBJECT (parent of every class in JAVA)
//        p.setFirst("oo");
//        p.setFirst(345);
        System.out.println(p.getFirst() + " " + p.getSecond());
//        Pair<int> pI = new Pair(30,40);
        Pair<Integer> pI = new Pair<>(30, 40);
        System.out.println(pI.getFirst() + " " + pI.getSecond());

//        Pair<Vehicle> v = new Pair<>(new Vehicle(), new Vehicle() {});
//        PairString pS = new PairString("aa","bb");
//        PairDouble pD = new PairString(3.01,5.42);

        Pair<String> pS = new Pair<>("aa", "bb");
        System.out.println(pS.getFirst() + " " + pS.getSecond());
        Pair<Double> pD = new Pair<>(3.01, 5.42);
        System.out.println(pD.getFirst() + " " + pD.getSecond());

        int i1 = 10; //primitive
        Integer i2 = null;
        Integer i3 = 10; //non-primitive ( object and ref to the object)

        Pair<String> pS1 = new Pair<>();
        pS1.setFirst("kok");
        System.out.println(pS1.getFirst() + " " + pS1.getSecond());
    }
}
