package z_test;

public class FindGCD {
    public static void main(String[] args) {

    int x = 6;
    int y = 36;
    int div = 1;
    int gcd = 0;
    if(x>y) {
        while(div<=y){
            if(x%div==0&&y%div==0){
                gcd = div;
                div++;
                continue;
            }
            div++;
        }
    }
    else{
        while(div<=x){
            if(x%div==0 && y%div==0){
                gcd = div;
                div++;
                continue;
            }
            div++;
        }
    }
        System.out.print(gcd);
    }
}
