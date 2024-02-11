package Revision.OOPS.OOPSOneTwoThree;

public final class Vehicle4 implements VehicleInterface{
    //Interface is a contract
    // if vehicle(Non abstract) implements VehicleInterface(Pure abstract)
    //then each method in VehicleInterface must implement by Vehicle class
    //by implements Vehicle is signing a contract with VehicleInterface
    private String colour;
    protected int maxSpeed;
    @Override
    public boolean isMotorised() {
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
    void print(){
        System.out.println(PI);
    }
}
