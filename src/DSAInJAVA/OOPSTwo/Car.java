package DSAInJAVA.OOPSTwo;

public class Car extends Vehicle{
    int numDoors;
    int maxSpeed;
    public Car(int numDoors){
        super(100);
        System.out.println("Car Constructor");
        this.numDoors = numDoors;
    }
    public Car(int numDoors, int maxSpeed){
        super(maxSpeed);
        System.out.println("Car Constructor");
        this.numDoors = numDoors;
        this.maxSpeed = maxSpeed;
    }
    public void print() {
        super.print();
//        System.out.print("Car: ");
//        System.out.print("Colour "+getColour()+" ");
//        System.out.print("MaxSpeed "+maxSpeed+" ");
        System.out.println("Num door "+numDoors);
    }
    public void printMaxSpeed(){
//        super.maxSpeed = 150;
//        System.out.println("MaxSpeed "+super.maxSpeed+" ");
        System.out.println("MaxSpeed "+maxSpeed+" ");
    }

}
