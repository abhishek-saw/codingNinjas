package DSAInJAVA.OOPSOne;

import static DSAInJAVA.OOPSOne.Fraction.addition;

public class FractionUse {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4, 6);
        f1.print();
        f1.increment();
        f1.print();
        f1.setNumerator(12);
        f1.print();

        Fraction f2 = new Fraction(4, 8);
        Fraction f3 = new Fraction(2, 8);
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
