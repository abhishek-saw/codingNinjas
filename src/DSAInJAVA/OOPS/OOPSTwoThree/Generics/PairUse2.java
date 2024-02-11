package DSAInJAVA.OOPS.OOPSTwoThree.Generics;

public class PairUse2 {
    public static void main(String[] args) {
        Pair2<String, Integer> p = new Pair2<>("aa", 10);
        System.out.println(p.getFirst() + " " + p.getSecond());

//        ChainGenericPair
        Pair2<Pair2<String,Integer>, String> chainPair = new Pair2<>();

        Pair2<String,Integer> pairForChain = new Pair2<>("hello i am first string", 10);
        chainPair.setFirst(pairForChain);
        chainPair.setSecond("Hi I am second string");

        System.out.println(chainPair.getFirst().getFirst());
        System.out.println(chainPair.getFirst().getSecond());
        System.out.println(chainPair.getSecond());


    }
}
