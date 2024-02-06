package DSAInJAVA.OOPS.OOPSOne;

import DSAInJAVA.OOPS.OOPSTwoThree.DivideByZeroException;

import static DSAInJAVA.OOPS.OOPSOne.Fraction.addition;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = null;
        try {
            f1 = new Fraction(4, 6);
        } catch (DivideByZeroException e) {
            System.out.println("Divide by Zero Exception raised");
        }
        f1.print();
        f1.increment();
        f1.print();
        f1.setNumerator(12);
        f1.print();

        Fraction f2 = null;
        try {
            f2 = new Fraction(4, 8);
        } catch (DivideByZeroException e) {
            System.out.println("Divide by Zero Exception raised");
        }
        Fraction f3 = null;
        try {
            f3 = new Fraction(2, 8);
        } catch (DivideByZeroException e) {
            System.out.println("Divide by Zero Exception raised");
        }
        f2.print();
        f3.print();

        Fraction f4 = addition(f2,f3);
        f4.print();

        f2.add(f3);
        f2.print();

        f2.subtract(f3);
        f2.print();

        f2.multiple(f3);
        f2.print();
    }
}
