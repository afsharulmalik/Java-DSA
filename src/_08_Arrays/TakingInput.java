package _08_Arrays;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        // Taking Input
        System.out.print("Enter the elements of Array : ");
        for(int i =0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Output
        System.out.println();
        System.out.print("The given Array is as follows : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
