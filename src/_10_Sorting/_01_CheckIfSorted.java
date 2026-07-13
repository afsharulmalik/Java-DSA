package _10_Sorting;

import java.util.Scanner;

public class _01_CheckIfSorted {

    // Method
    public static boolean arraySortedOrNot(int n, int[] arr) {
        for (int i = 0; i<n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in the Array : ");
        int n = sc.nextInt();  // length of the Array

        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];    // size of Array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if(arraySortedOrNot(n, arr)){
            System.out.print("The Array is Sorted.");
        }else {
            System.out.print("The Array is not Sorted.");
        }
    }
}
