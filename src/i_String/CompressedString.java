package i_String;

public class CompressedString {
    public static void main(String[] args) {
        String str = "aaabbccdsa";
        System.out.println(compressedString(str));
    }

    private static String compressedString(String str) {
        String answer = "";
        int arr[] = new int[256];
        for(int i = 0;i<str.length();i++){
            int num = str.charAt(i);
            arr[num] +=1;
        }
        for(int j = 0;j<arr.length;j++){
            if(arr[j]!=0){
                answer= answer + (char)j;
                if(arr[j]!=1){
                    answer= answer +arr[j];
                }
            }
        }
        return answer;
    }
}
