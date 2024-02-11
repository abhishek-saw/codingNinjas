package Revision.OOPS.OOPSOneTwoThree;


public class Truck extends Vehicle {
    int maxLoadingCapacity;

    public Truck(int maxSpeed) {
        super(maxSpeed);
    }


    public void print(){
        System.out.println("Vehicle=> "+"Colour: "+getColour() +" MaxSpeed: " +
                maxSpeed + " MaxLoadingCapacity: " + maxLoadingCapacity);
    }
    @Override
    public boolean isMotorised() {
        return true;
    }

    @Override
    public String getCompany() {
        return null;
    }
}
