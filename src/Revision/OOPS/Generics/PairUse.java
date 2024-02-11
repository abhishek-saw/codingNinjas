package Revision.OOPS.Generics;

public class PairUse {
    public static void main(String[] args) {
        Pair<Integer,Integer> pn = new Pair<>(10,12);
        System.out.println(pn.getFirst() + " " +  pn.getSecond());

        Pair<String,String> ps = new Pair<>("ABHISHEK","SAW");
        ps.setFirst("Hello");
        System.out.println(ps.getFirst() + " " +  ps.getSecond());

        Pair<Double,Double> pd = new Pair<>(3.14,7.2);
        System.out.println(pd.getFirst() + " " +  pd.getSecond());

//        Pair<Vehicle> pair = new Pair<>(new Vehicle(100), new Vehicle());
//        Pair p = new Pair(10,20);
////      Not incorrect but dangerous as first and second become type Object
//        p.setFirst(100);
//        p.setFirst("wer");
//        String  f = (String) p.getFirst();
//        System.out.println(f);

        int i1 = 10;
        Integer i2 = 10; //i2 is reference
        System.out.println(i1);
        System.out.println(i2);

        Pair<String,String> stringPair = new Pair<>();
        stringPair.setFirst("Hellos");
        System.out.println(stringPair.getFirst() + " " +  stringPair.getSecond());

        Pair<String ,Integer> twoTypes = new Pair<>("Give me String",100);
        System.out.println(twoTypes.getFirst() + " " +  twoTypes.getSecond());

        Pair<Pair<String,Integer>,String> pairOfPair = new Pair<>(new Pair<>("String In pairs",10),"DoneBoom");
        System.out.println(pairOfPair.getFirst().getFirst() + " " + pairOfPair.getFirst().toString()
                + " " +  pairOfPair.getSecond());

        Pair<Pair<String,Integer>,String> pairOfPair2 = new Pair<>();
        Pair<String,Integer> pairInner = new Pair<>("StringInPairInner",20);
        pairOfPair2.setFirst(pairInner);
        pairOfPair2.setSecond("StringsOfPair");
        System.out.println(pairOfPair2.getFirst().getFirst());
        System.out.println(pairOfPair2.getFirst().getSecond());
        System.out.println(pairOfPair2.getSecond());

        Pair<Pair<String,Integer>,Pair<String,Integer>> pairOfPairOfPair =
                new Pair<>(new Pair<>("string1",100),new Pair<>("string2",101));
        System.out.println(pairOfPairOfPair.getFirst().getFirst());
        System.out.println(pairOfPairOfPair.getFirst().getSecond());
        System.out.println(pairOfPairOfPair.getSecond().getFirst());
        System.out.println(pairOfPairOfPair.getSecond().getSecond());
    }
}
