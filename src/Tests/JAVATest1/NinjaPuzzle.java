package Tests.JAVATest1;

public class NinjaPuzzle {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        while(i<=n){
            int space = 1;
            while(space<i){
                System.out.print(' ');
                space++;
            }
            int star = 1;
            while(star<=n-i+1){
                System.out.print('*');
                star++;

            }
            i++;
            System.out.println();
        }


    }
}
