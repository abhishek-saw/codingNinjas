package DSAInJAVA.OOPS.OOPSTwoThree;

public class VehicleUse6 {
    public static void main(String[] args) {

        Vehicle2 v = new Vehicle2();
//        VehicleInterface v1 = new VehicleInterface(); //abstract hence incomplete hence class can not initiate
        VehicleInterface vI; // reference can be created and use it to achieve polymorphism
        vI = new Vehicle2();
        vI.getCompany();
//      vI.print(); error because it will only use the methods defined in interface
    }
}
