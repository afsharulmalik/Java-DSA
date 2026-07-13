package _08_Arrays;

// Q. Find the maximum value out of all the elements in the array.

import java.util.Scanner;
public class largestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Taking input
        System.out.print("Enter the elements of the Array : ");
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        // Algorithm

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("The largest element of the given Array is : "+max);
    }
}
