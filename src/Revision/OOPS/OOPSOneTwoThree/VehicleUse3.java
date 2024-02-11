package Revision.OOPS.OOPSOneTwoThree;
public class VehicleUse3 {
    public static void main(String[] args) {
        // abstract makes Vehicle incomplete, and we have to implement that method , it's a must.
//        Vehicle v = new Vehicle(1000) {
//            @Override
//            public boolean isMotorised() {return true;}
//        };
        Vehicle v1;
        v1 = new Car(4) {
            @Override
            public String getCompany() {
                return null;
            }
        };
        System.out.println(v1.isMotorised());
    }
}
