package Revision;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1: " + s1);
        s1.print();
        Student s2  = new Student();
        s2.name = "ab hi";
        s2.setRollNumber(2);
        System.out.println("s2: " + s2);
        s2.print();
        Student s3 = new Student("abbhi");
        System.out.println("s3: " + s3);
        s3.print();
        Student s4 = new Student("lol");
        System.out.println("s4: " + s4);
        s4.print();
        //        Student.numStudents = 100;
        System.out.println(Student.getNumStudents());
        System.out.println(Student.CONVERSIONFACTOR);





    }
}
