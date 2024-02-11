package Revision.OOPS.OOPSOneTwoThree;

public class ComplexUse {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        c1.setReal(3);
        c1.setImaginary(4);
        c1.print();

        Complex c2 = new Complex(5,6);
        c1.add(c2);
        c1.print();

        Complex c3 = new Complex(5,6);
        c1.subtract(c3);
        c1.print();

        Complex c4 = new Complex(3,2);
        System.out.println();
        c1.print();
        c4.print();
        c1.multiply(c4);
        c1.print();

        Complex c5 = Complex.addition(c3,c4);
        c5.print();
    }
}
