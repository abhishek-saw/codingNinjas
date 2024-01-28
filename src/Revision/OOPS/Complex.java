package Revision.OOPS;

public class Complex {
    private int real;
    private int imaginary;
    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public int getReal() {return real;}
    public void setReal(int real) {this.real = real;}
    public int getImaginary() {return imaginary;}
    public void setImaginary(int imaginary) {this.imaginary = imaginary;}
    public void print() {
        if(this.real==0) System.out.println(imaginary+"i");
        else if (this.imaginary==0) System.out.println(real);
        else if (this.imaginary<0) System.out.println(real+" "+"i"+imaginary);
        else System.out.println(real+" + "+"i"+imaginary);
    }
    public void add(Complex c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }
    public void subtract (Complex c2) {
        this.real = this.real - c2.real;
        this.imaginary = this.imaginary - c2.imaginary;
    }
    public void multiply(Complex c2) {
        int r = this.real * c2.real - this.imaginary * c2.imaginary;
        int i = this.real * c2.imaginary + this.imaginary * c2.real;
        this.real = r;
        this.imaginary = i;
    }
    public static Complex addition(Complex c3, Complex c4) {
        int real = c3.real+ c4.real;
        int imaginary = c3.imaginary+ c4.imaginary;
        Complex newSum = new Complex(real,imaginary);
        return newSum;
    }
}
