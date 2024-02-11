package Revision.OOPS.OOPSOneTwoThree;

public class FractionsUse {
    public static void main(String[] args) {
        Fractions f1 = new Fractions(4, 6);
        f1.print();
        Fractions f2 = new Fractions(4, 9);
        f2.increment();
        f2.print();
        f1.add(f2);
        f1.print();
        Fractions f3 = Fractions.Addition(f1,f2);
        f3.print();

        Fractions f4 = new Fractions(4, 6);
        f4.print();
        Fractions f5 = new Fractions(4, 9);
        f5.print();
        f4.subtract(f5);
        f4.print();
        Fractions f6 = Fractions.Subtraction(f4,f5);
        f6.print();

        Fractions f7 = new Fractions(2, 6);
        f7.print();
        Fractions f8 = new Fractions(4, 9);
        f8.print();
        f7.multiply(f8);
        f7.print();

        Fractions f9 = new Fractions(2, 6);
        f9.print();
        Fractions f10 = new Fractions(4, 9);
        f10.print();
        f9.divide(f10);
        f9.print();

        Fractions f11 = new Fractions(2, 0);
        f11.print();
    }
}