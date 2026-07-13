package _08_Array;

import java.util.Scanner;

public class _18_RotateArray {

    // methods to reverse Array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // system mera code ko yahaa se read krna start karega

    public static void main(String[] args) {
//        int[] arr = {3,19,56,83,18,24,85,14};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements in the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter elements of Array : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter no of Rotations (d) : ");   // leetcode par yhi ko k se initialize kiya gya hai
        int d = sc.nextInt();
        d%=n;

        reverse(arr, 0, d-1);

        reverse(arr, d, n-1);

        reverse(arr, 0, n-1);

        // Output result
        System.out.print("Rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
