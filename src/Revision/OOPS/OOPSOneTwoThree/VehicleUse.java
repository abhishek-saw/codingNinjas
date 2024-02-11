package Revision.OOPS.OOPSOneTwoThree;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(1000) {
            @Override
            public boolean isMotorised() {
                return false;
            }

            @Override
            public String getCompany() {
                return null;
            }
        };
        // abstract makes it incomplete, and we have to implement that method , it's a must.
        Vehicle v4; //it is okay
        v.setColour( "red");
        v.maxSpeed = 100;
        v.print();
        System.out.println();

        Car c = new Car(2) {
            @Override
            public String getCompany() {
                return null;
            }
        };
        c.setColour("yellow");
        c.maxSpeed = 70;
        c.noOfDoors = 4;
        c.print();
        c.printMaxSpeed();
        System.out.println();

        Bicycle b = new Bicycle();
        b.setColour("black");
        b.maxSpeed = 20;
        b.print();
        System.out.println();

        Vehicle v1 = new Car(4) {
            @Override
            public String getCompany() {
                return null;
            }
        };
        v1.maxSpeed = 900;
//        v1.noOfDoors = 9; not in Vehicle compile poly
        v1.print(); //call car as runtime poly
//        v1.printMaxSpeed(); not in Vehicle
        System.out.println();

//        Car c1 = new Vehicle();


        Vehicle v2 = new Car(4) {
            @Override
            public String getCompany() {
                return null;
            }
        };
        v2 = new Bicycle();
        Car c2  = (Car) v2;
        c.noOfDoors=3; //error

        // Object is super class of every class
        Object o = new Car(4) {
            @Override
            public String getCompany() {
                return null;
            }
        };


    }
}
