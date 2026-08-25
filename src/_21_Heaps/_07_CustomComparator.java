package _21_Heaps;

public class _07_CustomComparator {
    static class Student implements Comparable<Student>{
        String name;
        int rno;
        double cgpa;
        Student(String name, int rno, double cgpa){
            this.name = name;
            this.rno = rno;
            this.cgpa = cgpa;
        }
        public int compareTo(Student s){
            return Integer.compare(this.rno, s.rno);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Malik", 67, 7.6);
        Student s2 = new Student("Abhishek", 6, 6.5);
        Student s3 = new Student("Afsharul", 21, 9.4);
        Student s4 = new Student("Moon", 69, 9);
        Student[] arr = {s1, s2, s3, s4};
        for(Student s : arr){
            System.out.print(s.name+" ");
        }
    }
}
