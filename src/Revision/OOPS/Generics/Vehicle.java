package Revision.OOPS.Generics;

public class Vehicle implements PrintInterface{
    String company;
    int maxSpeed;
    public Vehicle(String company,int maxSpeed){
        super();
        this.company = company;
        this.maxSpeed = maxSpeed;
    }
    public void print(){
        System.out.println(company + " " + maxSpeed);
    }
}
