package DSAInJAVA.OOPS.OOPSTwoThree;

public abstract class Bicycle extends Vehicle{
    public Bicycle(){
        super(100);
        System.out.println("Bicycle Constructor");
    }

    //abstract methods
    @Override
    public boolean isMotorized() {
        return false;
    }
}
