package Tests.DSATest1;

public class CheckStringSequence {
    public static void main(String[] args) {
        String a = "abchjsgsuohhdhyrikkknddg";
        String b = "covding";
        System.out.println(checkSequence(a,b));
    }

    private static boolean checkSequence(String a, String b) {
        if(b.length()==0){
            return true;
        }
        if(a.length()==0){
            return false;
        }
        if(a.charAt(0)==b.charAt(0)){
            return checkSequence(a.substring(1),b.substring(1));
        }
        else{
            return checkSequence(a.substring(1),b);
        }
    }
}
