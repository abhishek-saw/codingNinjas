package Tests.JAVATest2;

public class MinLengthWord {
    public static void main(String[] args) {
        String str = "Welcome to Codiiiing Ninjas";
        String str2 = "bfwefewff lde2d123d owefwefqwefwefweqf ued2d23d jhjhjh jkjkjkjk ioioioioi jkjkjkjkjkjkjkjkjkjkkjkjkjkkj klklklkllk klklklklklklklklklklklklklklkl ytuyuyiuyiuyy";

//        String ans = minLengthWord(str);
//        System.out.println(ans);
        String ans2 = minLengthWord(str2);
        System.out.println(ans2);
    }

    private static String minLengthWord(String str) {
        String result = "";
        String word = "";
        int minCount = Integer.MAX_VALUE;
        int count = 0;

        int i = 0;
        while(i<str.length()){
            if(str.charAt(i)!=' ') {
                word += str.charAt(i);
                count++;
            }
            else {
                if (count < minCount) {
                    result = word;
                    minCount = count;
                }
                count = 0;
                word = "";
            }
            i++;
        }
        if(count<minCount){
            result = word;
            minCount = count;
        }
        System.out.println(word);
        System.out.println(minCount);
        return result;
    }
}
