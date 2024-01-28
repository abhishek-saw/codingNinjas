package Revision;

public class Car extends Vehicle {
    int noOfDoors;
    int maxSpeed;
    public Car(int noOfDoors){
        super(250);
        System.out.println("Car Constructor");
        this.noOfDoors = noOfDoors;
    }
    public void print(){
        super.print();
        System.out.println("Car=> "+"Colour: "+getColour() +" MaxSpeed: " +maxSpeed + " NoOfDoors :"+ noOfDoors);
    }
    public void printMaxSpeed(){
//        super.maxSpeed =150;
        System.out.println("MaxSpeed: " + maxSpeed +" SuperMaxSpeed: " + super.maxSpeed);
    }
}
