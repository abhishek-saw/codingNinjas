package DSAInJAVA.OOPS.OOPSOne;

import DSAInJAVA.OOPS.OOPSTwoThree.Vehicle;

public class VehicleUse2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(100) {
            //abstract methods

            @Override
            public boolean isMotorized() {
                return false;
            }

            @Override
            public String getCompany() {
                return null;
            }
        };
        //parent class
        v.setColour("Blue");
//        v.maxSpeed = 120; //protected not public hence not accessible, not derived class
        v.print();
    }
}
