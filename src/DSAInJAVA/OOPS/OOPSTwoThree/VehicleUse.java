package DSAInJAVA.OOPS.OOPSTwoThree;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(150) {
            //abstract methods
            @Override
            public boolean isMotorized() {
                return false;
            }

            @Override
            public String getCompany() {
                return null;
            }
        }; //parent class
        v.setColour("Blue");
        v.maxSpeed = 120;
        v.print();

        System.out.println();

        Car c = new Car(5) {
            @Override
            public String getCompany() {
                return null;
            }
        }; //child class
        c.setColour("Black");
        c.maxSpeed = 140;
        c.numDoors = 4;
        c.print(); // function overriding: print() -> Car() && //maxSpeed= 100: print() -> Car() -> Vehicle -> maxSpeed
        c.printMaxSpeed(); //maxSpeed= 140: print() -> Car() -> maxSpeed

        System.out.println();

        Bicycle b = new Bicycle() {
            @Override
            public String getCompany() {
                return null;
            }
        }; //child class
        b.print(); // not function overriding: print() -> Bicycle() -> Vehicle()

        System.out.println();

        Car c1 = new Car(4, 120) {
            @Override
            public String getCompany() {
                return null;
            }
        }; //child class
        c1.setColour("Black");
        c1.print();
        c1.printMaxSpeed();
    }
}
