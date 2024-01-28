package Revision;

public class Fractions {
    private int num;
    private int demi;
    public int getNum() {return num;}
    public void setNum(int num) {
        this.num = num;
        simplify();
    }
    public int getDemi() {return demi;}
    public void setDemi(int demi) {
        if (demi<=0){
            throw new RuntimeException();
        }
        this.demi = demi;
    }
    public Fractions(int num, int demi){
        if (demi<=0){
            throw new RuntimeException();
//            throw new DivideByZeroException();
        }
        this.num = num;
        this.demi = demi;
        simplify();
    }
    public void print() {
        if (num==0) System.out.println(0);
        else if (demi==1) System.out.println(num);
        else System.out.println(num+"/"+demi);
    }
    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(num,demi);
        for(int i = 2;i<=smaller;i++){
            if (num%i==0 && demi%i==0){
                gcd = i;
            }
        }
        num = num/gcd;
        demi = demi/gcd;
    }
    public void increment() {
        this.num = this.num + this.demi;
        simplify();
    }
    public void add(Fractions f2) {
        this.num = this.num*f2.demi + this.demi*f2.num;
        this.demi = this.demi*f2.demi;
        simplify();
    }
    public void subtract(Fractions f2) {
        this.num = this.num * f2.demi - this.demi * f2.num;
        this.demi = this.demi * f2.demi;
        simplify();
    }
    public void multiply(Fractions f2) {
        this.num = this.num*f2.num;
        this.demi = this.demi*f2.demi;
        simplify();
    }
    public void divide(Fractions f2) {
        this.num = this.num*f2.demi;
        this.demi = this.demi*f2.num;
        simplify();
    }
    public static Fractions Addition(Fractions f1, Fractions f2) {
        int nums = f1.num*f2.demi + f1.demi*f2.num;
        int demis = f1.demi*f2.demi;
        Fractions newSums = new Fractions(nums,demis);
        return newSums;
    }
    public static Fractions Subtraction(Fractions f1, Fractions f2) {
        int nums = f1.num*f2.demi + f1.demi*f2.num;
        int demis = f1.demi*f2.demi;
        Fractions newSubs = new Fractions(nums,demis);
        return newSubs;
    }
}
