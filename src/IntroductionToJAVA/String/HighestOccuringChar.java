package IntroductionToJAVA.String;

public class HighestOccuringChar {
    public static void main(String[] args) {
        String str = "abdefqggggggbabfba";
        System.out.println(highestOccuringChar(str));
    }

    public static char highestOccuringChar(String str) {
        int max = 0;
        int ans = 0;
        int arr[] = new int[256];
        for(int i = 0;i<str.length();i++){
                int num = str.charAt(i);
                arr[num] +=1;
        }
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                ans = i;
            }
        }

        return (char)ans;
    }
}
