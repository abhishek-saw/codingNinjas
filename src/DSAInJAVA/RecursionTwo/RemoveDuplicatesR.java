package DSAInJAVA.RecursionTwo;

public class RemoveDuplicatesR {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("aaabccaaa"));
        System.out.println(removeDuplicates("tadayutaysgcgtttggytytyyyikk"));
        System.out.println(removeDuplicates("CCooddiinnggNNiinnnnjjjjaaaassss"));


    }

    private static String removeDuplicates(String s) {
        if (s.length()==1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return  removeDuplicates(s.substring(1));
        }
        else{
            return s.charAt(0) + removeDuplicates(s.substring(1));
        }
    }
}
