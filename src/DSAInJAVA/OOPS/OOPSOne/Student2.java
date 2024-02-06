package DSAInJAVA.OOPS.OOPSOne;

public class Student2{
    public String name;
    final private int rollNumber;
    double cgpa;
    final static double converisonFactor= 0.95;
    private static int numStudents;

    public Student2(String name){
        this.name=name;
        this.rollNumber= numStudents;
        numStudents++;
    }
    public Student2(String name, int rollNumber){
        this.name=name;
        this.rollNumber= numStudents;
        numStudents++;
    }

//    public Student(String n){
//      name=n;
//      //rollNumber= 10;
//    }
//    public Student(){
//      name="abc";
//      rollNumber=10;
//    }

    public int getRollNumber() {
        return rollNumber;
    }
    public static int getNumStudents() {
        return numStudents;
    }

    public void setRollNumber(int rollNumber) {
        if(rollNumber<=0){
            return;
        }
        System.out.println("this : " + " " + this);
    }
}
