package DSAInJAVA.OOPSTwoThree;

//final public class Vehicle { // It will throw error in each child class as it means we are not allowing Vehicle class to car class change, add any property or extends etc
public abstract class Vehicle {
    private String colour;
//  final private String colour; //we can ony assign value to this once
    protected int maxSpeed;
    public Vehicle(){
        System.out.println("Vehicle Constructor");
    }
    public Vehicle(int maxSpeed){
        System.out.println("Vehicle Constructor");
        this.maxSpeed = maxSpeed;
    }
//  final public void print(){ // It will give error in child class of car as it was overriding the method in case car print is called.
    public void print(){
        System.out.print("Vehicle: ");
        System.out.print("Colour "+colour+" ");
        System.out.println("MaxSpeed "+maxSpeed);
    }


    //abstract method: As some child will have some property and some will not, and we should not define this method everywhere in child class
    //Currently we don't know if the car is motorised or not that is why we are adding astract to the method and class so that every child will get this method and use them as they needed
    //It will throw in child class and object making as both extends vehicle class which is in incomplete
    public abstract boolean isMotorized();
    public abstract String getCompany();

    //getters and setters
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
}
