package i_String;
public class CountWords {
    public static void main(String[] args) {
        String str = "";
        System.out.println(countWords(str));
    }

    private static int countWords(String str) {
        int count = 0;
        if (!str.isEmpty()) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }
}
