package DSAInJAVA.RecursionThreeAssignment;

public class PairStar {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "aaaa";
        System.out.println(addStars(s1));
        System.out.println(addStars(s2));
    }

    private static String addStars(String s) {
        if(s.length()==1){
            return String.valueOf(s.charAt(0));
        }
        if(s.charAt(0)==s.charAt(1)){
            return s.charAt(0) + "*" + addStars(s.substring(1));
        }
        else{
            return s.charAt(0) + addStars(s.substring(1));
        }
    }
}
