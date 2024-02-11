package Revision.OOPS.OOPSOneTwoThree;

public class Car5 extends Vehicle5 implements VehicleInterface, CarInterface {
    @Override
    public boolean isMotorised() {return true;}
    @Override
    public String getCompany() {return null;}
    @Override
    public int numGears() {return 5;}
    void print(){
        System.out.println(PI);
    }

}
