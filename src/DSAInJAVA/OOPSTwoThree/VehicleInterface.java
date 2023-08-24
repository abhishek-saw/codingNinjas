package DSAInJAVA.OOPSTwoThree;

public interface VehicleInterface {
    //interface are pure abstract , all method will be abstract
    //both methods are public and abstract
    //interface acts like a contract so that vehicle not implements the non-abstract methods and vehicle interface have to do that
    double PI = 007; //it will be public static final by default
    boolean isMotorized();
    String getCompany();
    int numGears();
    public default void print(){
        System.out.println("Hi I am vehicle2"+PI); // error if vehicle2 2 not implements VehicleInterface
    }


}
