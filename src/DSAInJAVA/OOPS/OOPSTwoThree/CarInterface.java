package DSAInJAVA.OOPS.OOPSTwoThree;

public interface CarInterface {
    int numGears();
    double PI = 007; //it will be public static final by default

    public default void print(){
        System.out.println("Hi I am vehicle2"+PI); // error if vehicle2 2 not implements VehicleInterface
    }
}
