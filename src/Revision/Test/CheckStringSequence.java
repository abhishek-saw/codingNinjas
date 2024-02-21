package Revision.Test;

public class CheckStringSequence {
    public static void main(String[] args) {
        String a = "abchjsgsuohhdhyrikkknddg";
        String b = "coding";
        System.out.println(checkSequence(a,b));
    }

    private static boolean checkSequence(String a, String b) {
        if(b.isEmpty()) {
            return true;
        }
        if(a.isEmpty()){
            return false;
        }

        if(a.charAt(0)==b.charAt(0)){
            return checkSequence(a.substring(1),b.substring(1));
        }
        else {
            return checkSequence(a.substring(1),b);
        }
    }
}
