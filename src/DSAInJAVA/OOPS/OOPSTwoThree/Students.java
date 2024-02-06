package DSAInJAVA.OOPS.OOPSTwoThree;

public class Students implements PrintInterface{
    int rollNumber;

    public Students(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    @Override
    public void print() {
        System.out.println(rollNumber);
    }
}
