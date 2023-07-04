package DSAInJAVA.OOPSOne;

public class ComplexNumber {
    private int real;
    private int imaginary;

    //constructor
    public ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    //methods
    public void print() {
        if(this.imaginary<0){
            System.out.println(this.real+""+this.imaginary+"i");
            return;
        }
        System.out.println(this.real+"+"+this.imaginary+"i");
    }
    public void adds(ComplexNumber c) {
        this.real = this.real+c.real;
        this.imaginary = this.imaginary+c.imaginary;
    }

    public void multiple(ComplexNumber c) {
        int real = this.real*c.real-this.imaginary*c.imaginary;
        int imaginary = this.real*c.imaginary+this.imaginary*c.real;
        this.real = real;
        this.imaginary = imaginary;
    }
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        int real = c1.real+c2.real;
        int imaginary = c1.imaginary + c2.imaginary;
        ComplexNumber result = new ComplexNumber(real,imaginary);
        return result;
    }

    //getters and setters
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }


}
