package _08_Arrays;

// Q. Find the 2nd largest element in the given array.

import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Array : ");
        int n = scanner.nextInt();  // length of Array


        // Taking Input
        int[] arr = new int[n]; // initilizing the Array
        System.out.print("Enter the elements of the Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Algorithm
        // For max element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        // For 2nd max element
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println("The largest element in the given Array is : "+max);
        System.out.print("The 2nd largest element in the given Array is : "+smax);
    }
}
