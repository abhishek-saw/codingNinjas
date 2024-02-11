package Revision.OOPS.OOPSOneTwoThree;

public abstract class Car extends Vehicle {
    int noOfDoors;
    int maxSpeed;
    public Car(int noOfDoors){
        super(250);
        System.out.println("Car Constructor");
        this.noOfDoors = noOfDoors;
    }
//    Error due to vehicle print method is final
//    public void print(){
//       super.print();
//        System.out.println("Car=> "+"Colour: "+getColour() +" MaxSpeed: " +maxSpeed + " NoOfDoors :"+ noOfDoors);
//    }
    public void print(){
        super.print();
        System.out.println("Car=> "+"Colour: "+getColour() +" MaxSpeed: " +maxSpeed + " NoOfDoors :"+ noOfDoors);
    }
    // complete the incomplete abstract or become the abstract
    // Either you implement the abstract or run long enough to see you becoming the abstract
    @Override
    public boolean isMotorised() {
        return true;
    }
    public void printMaxSpeed(){
//        super.maxSpeed =150;
        System.out.println("MaxSpeed: " + maxSpeed +" SuperMaxSpeed: " + super.maxSpeed);
    }
}
