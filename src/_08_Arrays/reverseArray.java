package _08_Arrays;

import java.util.Scanner;

// Q. Wap to reverse the Array without using any extra Array.

public class reverseArray {

    // Function to swap the Array.

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // For taking Input.

        System.out.print("Enter the number of elements in the Array : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the Array : ");
        for (int i =0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        // Algorithm
        int i =0;
        int j =n-1;
        while (i<j){
            swap(arr, i, j);
            i++;
            j--;
        }

        System.out.print("The reversed Array is : ");
        for (j =0; j<n; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
