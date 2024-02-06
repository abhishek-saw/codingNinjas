package DSAInJAVA.OOPS.OOPSOne;


//class of student is created
public class Student {
    String name; //default modifier
    public int rollNumber; //public modifier
    private int idNumber; //private modifier
    double cgpa;
    final double conversionFactor = 0.95;

    //constructor
    public Student(){
    }
    public Student(String name){
        this.name = name;
    }
    public Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public Student(String name, int rollNumber, int idNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        this.idNumber = idNumber;
    }
    public Student(String name, int rollNumber,int idNumber, int dob){
        this.name = name;
        this.rollNumber = rollNumber;
        this.idNumber = idNumber;
    }

    //getters and setters
    public int getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(int idNumber) {
        if(idNumber<=0){
            return;
        }
        System.out.println("this : " + " " + this);
        this.idNumber = idNumber;
    }
}
