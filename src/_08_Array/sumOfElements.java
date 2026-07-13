package _08_Array;

import java.util.Scanner;
public class sumOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements of the Array : ");
        int n = scanner.nextInt();  // This indicates the size of the array
        int[] arr = new int[n];

        // Taking the input of the n of students
        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sum of elements
        int sum = 0;
        System.out.print("The sum of the given Array is : ");
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.print(sum);
    }
}
