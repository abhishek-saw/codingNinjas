package DSAInJAVA.OOPSTwo;

public class Vehicle {
    private String colour;
    protected int maxSpeed;
    public Vehicle(){
        System.out.println("Vehicle Constructor");
    }
    public Vehicle(int maxSpeed){
        System.out.println("Vehicle Constructor");
        this.maxSpeed = maxSpeed;
    }
    public void print(){
        System.out.print("Vehicle: ");
        System.out.print("Colour "+colour+" ");
        System.out.println("MaxSpeed "+maxSpeed);
    }
    //getters and setters
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
}
