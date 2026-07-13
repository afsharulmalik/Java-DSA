package _10_BasicSorting;

import java.util.Scanner;

public class _12_InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in the Array : ");
        int n = sc.nextInt();

        // {4 1 7 3 9 1 0 3}
        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // there are two part in the array one is sorted part and other is unsorted part
        // Unsorted part ka pehla element sorted part mein sahi jagah insert karna hai

        // Time complexity :-
        // Best case : O(n)  : Array is already sorted.
        // Average case : O(n*n)
        // Worst case : O(n*n)  : Array is sorted in descending order.
        // Auxiliary Space : O(1)

        for(int i=0; i<arr.length; i++){
            int j =i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
