package _08_Array;

// Q. Given an array of marks of students, if the mark of any student is less than 35 print its roll number.[roll number here refers to the index of the array.]


import java.util.Scanner;
public class RollNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = scanner.nextInt();
        int[] marks = new int[n];

        // Taking the input of the n of students
        System.out.print("Enter the marks of the students : ");
        for (int i = 0; i < n; i++) {
            marks[i] = scanner.nextInt();
        }

        // Algorithm
        System.out.print("Roll numbers of students with marks less than 35 : ");
        for(int i = 0; i< n; i++){
            if(marks[i]<35){
                System.out.print(i+" ");
            }
        }
    }
}
