package DSAInJAVA.OOPSOne;

public class Polynomial {
    private int poly[];
    public int getCoefficient(int degree) {
        if(degree<poly.length){
            return this.poly[degree];
        }
        else{
            return 0;
        }
    }
    public Polynomial(){
        poly = new int[10];
    }
    public void setCoefficient(int degree, int coefficient){
        if(degree>= poly.length-1){
            int temp[] = poly;
            poly = new int[degree+1];
            for(int i=0;i<temp.length;i++){
                poly[i] = temp[i];
            }
        }
        poly[degree] = coefficient;
    }
    public void print() {
        for(int i = 0;i<poly.length;i++){
            if(poly[i]!=0){
                System.out.print(poly[i]+"x"+i+" ");
            }
        }
            System.out.println();
    }
    public Polynomial add(Polynomial p) {
        int len = Math.min(this.poly.length, p.poly.length);
        Polynomial result = new Polynomial();
        int i;
        for(i=0;i<len;i++) {
            result.setCoefficient(i,this.poly[i]+p.poly[i]);
        }
        while(i<poly.length){
            result.setCoefficient(i,this.poly[i]);
            i++;
        }
        while(i<p.poly.length){
            result.setCoefficient(i,p.poly[i]);
            i++;
        }

        return result;
    }
    public Polynomial subtract(Polynomial p) {
        int len = Math.min(this.poly.length, p.poly.length);
        Polynomial result = new Polynomial();
        int i;
        for(i=0;i<len;i++) {
            result.setCoefficient(i,this.poly[i]-p.poly[i]);
        }
        while(i<poly.length){
            result.setCoefficient(i,this.poly[i]);
            i++;
        }
        while(i<p.poly.length){
            result.setCoefficient(i,-p.poly[i]);
            i++;
        }
        return result;
    }
    public Polynomial multiply(Polynomial p) {
        Polynomial result = new Polynomial();
        for(int i =0;i<this.poly.length;i++){
            for(int j=0;j<p.poly.length;j++){
                int index = i+j;
                int mulCoefficient = this.poly[i]*p.poly[j];
                int preCoefficient = result.getCoefficient(index);
                result.setCoefficient(index,mulCoefficient+preCoefficient);
            }
        }
        return result;
    }
    public int evaluate(int number) {
        int sum  = 0;
        for(int i=0;i<this.poly.length;i++){
            int coefficients = this.getCoefficient(i);
            int power = (int) Math.pow(number,i);
            sum+=coefficients*power;
        }
        return sum;
    }
    public static Polynomial addPoly(Polynomial p1, Polynomial p2) {
        Polynomial result = new Polynomial();
        int len = Math.min(p1.poly.length, p2.poly.length);
        int i;
        for(i=0;i<len;i++) {
            result.setCoefficient(i,p1.poly[i]+p2.poly[i]);
        }
        while(i<p1.poly.length){
            result.setCoefficient(i,p1.poly[i]);
            i++;
        }
        while(i<p2.poly.length){
            result.setCoefficient(i,p2.poly[i]);
            i++;
        }
        return result;
    }
}
