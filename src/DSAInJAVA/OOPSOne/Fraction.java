package DSAInJAVA.OOPSOne;

import DSAInJAVA.OOPSTwoThree.DivideByZeroException;

public class Fraction {
    private int numerator;
    private int denominator;
    //constructor
    public Fraction(int numerator, int denominator) throws DivideByZeroException {
        if(denominator == 0){
            throw new DivideByZeroException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    //functions
    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator,denominator);
        for(int i= 2;i<=smaller;i++){
            if(numerator%i==0 && denominator%i==0){
                gcd=i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
    public void print(){
        if(denominator==1){
            System.out.println(this.numerator);
            return;
        }
        System.out.println(this.numerator+"/"+this.denominator);
    }
    public void increment() {
        numerator = denominator+numerator;
        simplify();
    }
    public void add(Fraction f) {
        this.numerator = this.numerator*f.denominator + this.denominator*f.numerator;
        this.denominator = f.denominator*this.denominator;
        simplify();
    }
    public void subtract(Fraction f) {
        this.numerator = this.numerator*f.denominator - this.denominator*f.numerator;
        this.denominator = f.denominator*this.denominator;
        simplify();
    }
    public void multiple(Fraction f) {
        this.numerator = this.numerator*f.numerator;
        this.denominator = f.denominator*this.denominator;
        simplify();
    }
    public static Fraction addition(Fraction f1, Fraction f2) {
        int num = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int den = f1.denominator*f2.denominator;
        Fraction result = null;
        try {
            result = new Fraction(num,den);
        } catch (DivideByZeroException e) {
            throw new RuntimeException(e);
        }
        ;
        return result;
    }
    // getters and setters
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        simplify();
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        if(denominator ==0){
            throw new ArithmeticException();
        }
        this.denominator = denominator;
        simplify();
    }
}
