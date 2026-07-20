package _15_OOPSinJava;

public class _01_UserDefinedFunction {
    public static class Student {  // khudka ek data type bana liya h
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Student s1 = new Student();   // declaration
        s1.name = "Afsharul";
        s1.rno = 67;
        s1.cgpa = 7.3;

        Student s2 = new Student();   // declaration
        s2.name = "Abhishek";
        s2.rno = 6;
        s2.cgpa = 7;

        Student s3 = new Student();   // declaration
        s3.name = "Anshul";
        s3.rno = 27;
        s3.cgpa = 7;

        System.out.print(s1.name+" "+s1.rno+" "+s1.cgpa);
        s1.cgpa = 7.5;  // this will update the cgpa of s1
        System.out.println();
        System.out.print(s1.cgpa);
    }
}
