package DSAInJAVA.OOPS.OOPSOne;
public class PolynomialUse {
    public static void main(String[] args) {
        Polynomial p1 = new Polynomial();
        p1.setCoefficient(0,3);
        p1.setCoefficient(2,2);
        p1.print();

        Polynomial p2 = new Polynomial();
        p2.setCoefficient(0,3);
        p2.setCoefficient(2,2);
        p2.setCoefficient(1,4);
        p2.setCoefficient(2,5);
        p2.setCoefficient(8,5);

        p2.print();

        Polynomial p1Addp2 = p1.add(p2);
        p1Addp2.print();

        Polynomial p1Subp2 = p1.subtract(p2);
        p1Subp2.print();

        Polynomial p1Mulp2 = p1.multiply(p2);
        p1Mulp2.print();

        int answer1 = p1.evaluate(10);
        System.out.println(answer1);
        int answer2 = p2.evaluate(10);
        System.out.println(answer2);
        Polynomial pSum = Polynomial.addPoly(p1,p2);
        pSum.print();
    }
}
