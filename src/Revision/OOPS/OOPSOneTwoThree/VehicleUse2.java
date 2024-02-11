package Revision.OOPS.OOPSOneTwoThree;
public class VehicleUse2 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(5000) {
            @Override
            public boolean isMotorised() {
                return false;
            }

            @Override
            public String getCompany() {
                return null;
            }
        };
        //protected
//        v.maxSpeed =100;
    }
}
