package Revision.OOPS.OOPSOneTwoThree;

public abstract class Vehicle {
    private String colour;
    protected int maxSpeed;
    public Vehicle(int maxSpeed){
        System.out.println("Vehicle Constructor");
        this.maxSpeed = maxSpeed;
    }
    public void print(){
        System.out.println("Vehicle=> "+"Colour: "+ colour +" MaxSpeed: " +maxSpeed);
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public abstract boolean isMotorised();
    public abstract String getCompany();
}
