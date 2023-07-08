package DSAInJAVA.OOPSTwo;

import java.util.Scanner;

//polymorphism
public class VehicleUse3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car(4, 100); //Every Car is a Vehicle
        v1.maxSpeed = 200;
        System.out.println(v1.getColour());
        v1.print(); // Car print called due to Runtime Polymorphism
//        v1.numDoors = 4;  error due to compile time polymorphism
//        It will only allow to access the property of a vehicle and car because it will check line by line and
//        v is a vehicle doesn't matter it is pointing towards a car it may change to bicycle next line

        System.out.println();

        Vehicle v2 = new Bicycle(); //Every Bicycle is a Vehicle

        System.out.println();

        // Car c = new Vehicle(3,20); Every Vehicle is not Car

        Vehicle v3;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 10) {
            v3 = new Car(2, 300);
        }
        else{
            v3 = new Vehicle();
        }
        v3.print();
//        v3.maxSpeed; Same issue as v1.numDoors Compile time polymorphism
    }
}
