package IntroductionToJAVA.Funtions;

public class FahrenheittoCelsiusTable {
    public static void main(String[] args) {
        int s = 0;
        int e = 200;
        int st = 20;
        printFahrenheitTable(s,e,st);
    }

    private static void printFahrenheitTable(int start, int end, int step) {
        int celcius = 0;
        for(int i = start;i<end;i+=step){
            celcius = (int) ((i -32)*(5.0/9.0));
            System.out.println(i +" " + celcius);
        }
    }
}
