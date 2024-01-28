package Revision;

public class Polynomial {
    private int[] poly;
    public Polynomial(){
        poly = new int[10];
    }
    public void setCoefficient(int degree, int coefficient){
        if(degree>=poly.length){
            doublePoly(degree);
        }
        this.poly[degree] = coefficient;
    }
    public int getCoefficient(int degree){
        if (degree>=this.poly.length) return 0;
        return this.poly[degree];
    }
    public int degree(){
        return poly.length;
    }
    public void print() {
        for (int i =0;i<this.poly.length;i++){
            if(this.poly[i]!=0){
                System.out.print(this.poly[i]+"x"+i+" ");
            }
        }
    }
    public Polynomial add(Polynomial p2) {
        int minDegree = Math.min(this.poly.length, p2.poly.length);
        Polynomial polySums = new Polynomial();
        int i;
        for (i=0;i<minDegree;i++){
            polySums.setCoefficient(i,poly[i]+p2.getCoefficient(i));
        }
        while (i<this.poly.length){
            polySums.setCoefficient(i,poly[i]);
            i++;
        }
        while (i<p2.poly.length){
            polySums.setCoefficient(i,p2.poly[i]);
            i++;
        }
        return polySums;
    }
    public Polynomial subtract(Polynomial p2) {
        int minDegree = Math.min(this.poly.length, p2.poly.length);
        Polynomial polySubs = new Polynomial();
        int i;
        for (i=0;i<minDegree;i++){
            polySubs.setCoefficient(i,poly[i]-p2.getCoefficient(i));
        }
        while (i<this.poly.length){
            polySubs.setCoefficient(i,poly[i]);
            i++;
        }
        while (i<p2.poly.length){
            polySubs.setCoefficient(i,-p2.poly[i]);
            i++;
        }
        return polySubs;
    }
    public Polynomial multiply(Polynomial p1) {
        Polynomial polyMul = new Polynomial();
        for(int i =0;i<poly.length;i++){
            for(int j =0;j<p1.poly.length;j++){
                int d = i+j;
                int coefficient = polyMul.getCoefficient(d)+this.poly[i]*p1.poly[j];
                polyMul.setCoefficient(d,coefficient);
            }
        }
        return polyMul;
    }
    public int evaluate(int num) {
        int sums =0;
        for(int i =0;i<this.poly.length;i++){
            sums+= (int) (this.getCoefficient(i)*Math.pow(num,i));
        }
        return sums;
    }
    public static Polynomial adds(Polynomial p1, Polynomial p2) {
        int minDegree = Math.min(p1.poly.length, p2.poly.length);
        Polynomial polySums = new Polynomial();
        int i;
        for (i=0;i<minDegree;i++){
            polySums.setCoefficient(i,p1.poly[i]+p2.getCoefficient(i));
        }
        while (i<p1.poly.length){
            polySums.setCoefficient(i,p1.poly[i]);
            i++;
        }
        while (i<p2.poly.length){
            polySums.setCoefficient(i,p2.poly[i]);
            i++;
        }
        return polySums;
    }
    private void doublePoly(int degree) {
        int[] temp = this.poly;
        this.poly = new int[degree+1];
        System.arraycopy(temp, 0, this.poly, 0, temp.length);
    }
}
