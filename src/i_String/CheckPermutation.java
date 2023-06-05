package i_String;

public class CheckPermutation {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(checkPermutation(str1,str2));
        String str3 = "sinrtg";
        String str4 = "striing";
        System.out.println(checkPermutation(str3,str4));
    }
    private static boolean checkPermutation(String str1, String str2) {
        int arr[] = new int[256];
        for(int i=0;i<str1.length();i++){
            int num = str1.charAt(i);
            arr[num] += 1;
        }
        for(int i=0;i<str2.length();i++){
            int num = str2.charAt(i);
            arr[num] -= 1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
