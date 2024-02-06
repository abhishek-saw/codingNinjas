package DSAInJAVA.OOPS.OOPSTwoThree;

public class VehicleUse5 {
    public static void main(String[] args) {
        Car c = new Car() {
            @Override
            public String getCompany() {
                return null;
            }
        };
        Vehicle v ;
        //abstract method: As some parent will have not all the method about child which only they have answer for ,
        // and we should not define this method every class in child class
        // throw error as child class and object making as both extends vehicle class which is incomplete
        // Vehicle v; no error as it was creating only object
        v = new Car() {
            @Override
            public String getCompany() {
                return null;
            }
        };
        System.out.println(v.isMotorized());
//        v = new Bicycle();
        // final variable, final method and final class
    }
}
