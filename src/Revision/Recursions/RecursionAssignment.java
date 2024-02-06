package Revision.Recursions;

public class RecursionAssignment {
    public static void main(String[] args) {
        System.out.println("findGeometricSum:");
        System.out.println(findGeometricSum(3));

        System.out.println("isPalindrome:");
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("attack"));

        System.out.println("sumOfDigits:");
        System.out.println(sumOfDigits(12345));

        System.out.println("multiplyTwoIntegers:");
        System.out.println(multiplyTwoIntegers(4,5));

        System.out.println("countZerosRec:");
        System.out.println(countZerosRec(1010));

        System.out.println("convertStringToInt:");
        System.out.println(convertStringToInt("12345"));

        System.out.println("addStars:");
        System.out.println(addStars("hello"));

        System.out.println("checkAB:");
        System.out.println(checkAB("abb"));
        System.out.println(checkAB("abbe"));
        System.out.println(checkAB("kabbalah"));

        System.out.println("staircase:");
        System.out.println(staircase(4));
        System.out.println(staircase(5));
    }
    public static int staircase(int n) {
        if(n==1 ){return 1;}
        if(n==2){return  2;}
        if(n==3){return  4;}
        return staircase(n-1) + staircase(n-2) + staircase(n-3);
    }
    public static boolean checkAB(String input) {
        if (input.isEmpty()) {
            return true;
        }
        if (input.charAt(0) == 'a') {
            if (input.substring(1).length()>1 && input.startsWith("bb", 1)) {
                return checkAB(input.substring(3));
            } else {
                return checkAB(input.substring(1));
                }
            }
        return false;
    }
    public static String addStars(String s) {
        if(s.length()==1){
            return s;
        }
        if(s.charAt(0)==s.charAt(1)){
            return s.charAt(0) +"*"+ addStars(s.substring(1));
        }
        else {
            return s.charAt(0) + addStars(s.substring(1));
        }
    }
    public static int convertStringToInt(String input){
        if(input.length()==1){
            return input.charAt(0)-'0';
        }
        return convertStringToInt(input.substring(0,input.length()-1))*10 + input.charAt(input.length()-1)-'0';
    }
    public static int countZerosRec(int input){
        if(input==0){
            return 1;
        }
        if(input<10){
            return 0;
        }
        if(input % 10 == 0){
            return 1+countZerosRec(input/10);
        } else {
            return countZerosRec(input/10);
        }
    }
    public static int multiplyTwoIntegers(int m, int n) {
        if(m==0 || n ==0) return 0;
        return m + multiplyTwoIntegers(m,n-1);
    }
    public static int sumOfDigits(int input) {
        if(input==0){
            return 0;
        }
        return input%10 + sumOfDigits(input/10);
    }
    public static boolean isPalindrome(String str) {
        if(str.length() <= 1) {
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }
        return isPalindrome(str.substring(1,str.length()-1));
    }
    public static double findGeometricSum(int k) {
        if(k==0){
            return 1;
        }
        return 1/Math.pow(2,k) + findGeometricSum(k-1);
    }
}
