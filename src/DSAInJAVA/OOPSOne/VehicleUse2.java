package DSAInJAVA.OOPSOne;

import DSAInJAVA.OOPSTwo.Vehicle;

public class VehicleUse2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(100); //parent class
        v.setColour("Blue");
//        v.maxSpeed = 120; //protected not public hence not accessible, not derived class
        v.print();
    }
}
