package IntorductionToJAVA.a_JavaFunda;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number= input.nextInt();
    if(number<0){
        System.out.println("negative");
    }
    else{
        System.out.println("positive");
    }

    }
}

