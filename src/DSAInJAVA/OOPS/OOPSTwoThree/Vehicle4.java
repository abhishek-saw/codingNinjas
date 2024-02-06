package DSAInJAVA.OOPS.OOPSTwoThree;

public class Vehicle4 implements PrintInterface{
    int maxSpeed ;
    String company;
    public Vehicle4(int maxSpeed, String company){
        this.maxSpeed = maxSpeed;
        this.company = company;
    }
    public void print(){
        System.out.println(maxSpeed + " " + company);
    }
}
