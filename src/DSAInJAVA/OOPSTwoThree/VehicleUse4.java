package DSAInJAVA.OOPSTwoThree;
//Class Cast and Object Class
public class VehicleUse4 {
    public static void main(String[] args) {
        Vehicle v = new Car(2, 900) {
            @Override
            public String getCompany() {
                return null;
            }
        };
//        v = new Bicycle(); Cast Class Exception
        Car c = (Car) v;
        c.numDoors = 3;
        c.print();
//        Object is the superclass of every class
        Object train = new Car(60, 500) {
            @Override
            public String getCompany() {
                return null;
            }
        };
        Object boat = new Vehicle(50) {
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


    }
}
