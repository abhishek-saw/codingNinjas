package DSAInJAVA.OOPSTwoThree;

public class Vehicle2 implements VehicleInterface{
    @Override
    public boolean isMotorized() {
        return false;
    }

    @Override
    public String getCompany() {
        System.out.print("I am company "+PI);
        return null ;
    }

    @Override
    public int numGears() {
        return 0;
    }

    //either declare vehicle2 as abstract or implement the abstract methods
    public void print(){
        System.out.println("Hi I am vehicle2");
//        System.out.println("Hi I am vehicle2"+PI); // error if vehicle2 2 not implements VehicleInterface
    }

}
