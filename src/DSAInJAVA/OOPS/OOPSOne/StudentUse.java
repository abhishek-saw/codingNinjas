package DSAInJAVA.OOPS.OOPSOne;

import java.util.Scanner;

//class of studentUse is created
public class StudentUse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //similarly
        Student s1 = new Student();
        // it will create new student object having properties of name and roll number
        // s1 ->stack memory and name and roll number ->heap memory
        //every object will have their own set of properties
        s1.name ="Abhilasha";
        s1.rollNumber = 1;
        System.out.println("s1 : " + s1);
//      s1.idNumber = 1;
//      s1.conversionFactor = 0.97;
        s1.setIdNumber(100); //setters
        System.out.print(s1.name+ " " + s1.rollNumber + " ");
        System.out.println(s1.getIdNumber()); //getters

        Student s2 = new Student("Scott");
        System.out.println("s2 : " + s2);
        System.out.println(s2.name+ " " + s2.rollNumber + " " + s2.getIdNumber());

        Student s3 = new Student("Ramayana",2);
        System.out.println("s3 : " + s3);
        System.out.println(s3.name+ " " + s3.rollNumber + " " + s3.getIdNumber());

        Student s4 = new Student("Ramayana",2,200);
        System.out.println("s4 : " + s4);
        System.out.println(s4.name+ " " + s4.rollNumber + " " + s4.getIdNumber());

        Student2 s5 = new Student2("Student2One");
        System.out.println("s5 : " + s5);
        System.out.println(s5.name+ " " + s5.getRollNumber() + " " + Student2.getNumStudents());

        Student2 s6 = new Student2("Student2Two");
        System.out.println("s6 : " + s6);
        System.out.println(s6.name+ " " + s6.getRollNumber() + " " + Student2.getNumStudents());

        Student2 s7 = new Student2("Student2Three");
        System.out.println("s7 : " + s7);
        System.out.println(s7.name+ " " + s7.getRollNumber() + " " + Student2.getNumStudents() + " " + Student2.converisonFactor);

    }
}
