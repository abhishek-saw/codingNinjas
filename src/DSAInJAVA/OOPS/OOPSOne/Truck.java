package DSAInJAVA.OOPS.OOPSOne;

import DSAInJAVA.OOPS.OOPSTwoThree.Vehicle;

public abstract class Truck extends Vehicle {
    int maxLoadingCapacity;

    public Truck(int maxSpeed) {
        super(maxSpeed);
    }

    public void print() {
        System.out.print("Truck: ");
        System.out.print("Colour "+getColour()+" ");
        System.out.println("MaxSpeed "+maxSpeed+" "); //protected not private hence accessible, derived class
        System.out.println("MaxLoadingCapacity "+maxLoadingCapacity);
    }
    //abstract methods
//    @Override
//    public boolean isMotorized() {
//        return true;
//    }
//
 }
