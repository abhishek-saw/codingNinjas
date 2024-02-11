package DSAInJAVA.OOPS.OOPSTwoThree;

public interface VehicleInterface {
    //interface are pure abstract , all method will be abstract
    //both methods are public and abstract
    //interface acts like a contract so that vehicle not implements the non-abstract methods
    // and vehicle interface have to do that
    //Interface is a contract
    // if vehicle(Non abstract) implements VehicleInterface(Pure abstract)
    //then each method in VehicleInterface must implement by Vehicle class
    //by implements Vehicle is signing a contract with VehicleInterface

    double PI = 007; //it will be public static final by default
    boolean isMotorized();
    String getCompany();
    int numGears();
    public default void print(){
        System.out.println("Hi I am vehicle2"+PI); // error if vehicle2 2 not implements VehicleInterface
    }


}
