package Revision.OOPS.OOPSOneTwoThree;

public class Student {
    String name;
    final private int rollNumber;
    double cgpa;
    public final static double CONVERSIONFACTOR = 0.95;
    private static int numStudents;
    public Student() {
        name = "abcd";
        numStudents++;
        rollNumber = numStudents;
//        conversionFactor = 0.97;
    }
    public Student(String name){
        this.name = name;
        numStudents++;
        this.rollNumber = numStudents;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getRollNumber() {return rollNumber;}
    public void setRollNumber(int rollNumber) {
        if (rollNumber<0){return;}
        System.out.println(this);
    }
    public static int getNumStudents() {return numStudents;}
    public void print() {
        System.out.println("name: " + name + " rollNumber: " +  rollNumber + " numStudents: " + Student.numStudents);
    }
}
