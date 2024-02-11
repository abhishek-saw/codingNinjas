package Revision.OOPS.OOPSOneTwoThree;

public class PolynomialUse {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.setCoefficient(0,3);
        p1.setCoefficient(200,2);
        p1.print();
        System.out.println();

        Polynomial p2 = new Polynomial();
        p2.setCoefficient(0,3);
        p2.setCoefficient(2,2);
        p2.setCoefficient(1,4);
        p2.setCoefficient(2,5);
        p2.print();
        System.out.println();

        Polynomial polySums = p1.add(p2);
        polySums.print();
        System.out.println();

        Polynomial polySubs = p1.subtract(p2);
        polySubs.print();
        System.out.println();

        Polynomial polyMul =  p1.multiply(p2);
        polyMul.print();
        System.out.println();

        Polynomial p3 = Polynomial.adds(p1,p2);
        p3.print();
        System.out.println();

        System.out.println(p1.evaluate(1));
        System.out.println(p2.evaluate(10));





    }
}
