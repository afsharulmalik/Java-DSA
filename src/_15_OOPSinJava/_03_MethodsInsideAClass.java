package _15_OOPSinJava;

public class _03_MethodsInsideAClass {
    public static class Student{
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+" "+cgpa);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Afsharul";
        s1.rno = 67;
        s1.cgpa = 7.3;

        Student s2 = new Student();
        s2.name = "Moon";
        s2.rno = 69;
        s2.cgpa = 5.5;

        Student s3 = new Student();
        s3.name = "Malik";
        s3.rno = 68;
        s3.cgpa = 4.3;

        s1.print();
        s2.print();
        s3.print();
    }
}
