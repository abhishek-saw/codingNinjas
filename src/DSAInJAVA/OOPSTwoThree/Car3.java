package DSAInJAVA.OOPSTwoThree;

public class Car3 extends Vehicle3 implements VehicleInterface,CarInterface {
    // both extends and implements work
    // car(class) can implements many interface but can't extend more than 1 class
    @Override
    public boolean isMotorized() {
        return false;
    }

    @Override
    public String getCompany() {
        return null;
    }

    @Override
    public int numGears() {
        return 0;
    }

    public void print() {
        //System.out.println("Hi I am vehicle2" + PI); //error as print is in both CarInterface and  VehicleInterface

    }
}
