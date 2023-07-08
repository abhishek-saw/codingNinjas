package IntorductionToJAVA.JavaFunda;

public class RemarkStudent {
    public static void main(String[] args) {
        int score = 90;
        if (75 < score && score <= 100) {
            System.out.println("Distinction");
        }
        else if (50 < score && score <= 75) {
            System.out.println("Average");
        }
        if (35 < score && score <= 50) {
            System.out.println("Below Average");
        }
    }
}
