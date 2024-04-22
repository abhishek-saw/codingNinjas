package DSAInJAVA.DynamicProgramming.DynamicProgrammingTwo;

public class EditDistanceRecursion {
    public static void main(String[] args) {
        String s = " whgtdwhgtdg";
        String t  = "aswcfg";
        System.out.println(editDistance(s,t));
    }

    private static int editDistance(String s, String t) {
        if(s.isEmpty()){
            return t.length();
        }
        if(t.isEmpty()){
            return s.length();
        }
        int ans;
        if(s.charAt(0)==t.charAt(0)){
            ans = editDistance(s.substring(1),t.substring(1));
        }
        else {
            int a = 1 + editDistance(s, t.substring(1));
            int b = 1 + editDistance(s.substring(1),t);
            int c = 1 + editDistance(s.substring(1), t.substring(1));
            ans = Math.min(a,Math.min(b,c));
        }
        return ans;
    }
}
