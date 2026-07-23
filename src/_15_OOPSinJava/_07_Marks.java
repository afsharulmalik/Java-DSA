package _15_OOPSinJava;

public class _07_Marks {
    public static class StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
        }
    }
    // we can also pass array into the constructor
    public static void main(String[] args) {
        int[] arr = {45,78,90,19,47};
        StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(2);
        s1.marks[0] = 89;
        s1.marks[1] = 99;
        s1.marks[2] = 59;
        s1.marks[3] = 69;
    }
}
