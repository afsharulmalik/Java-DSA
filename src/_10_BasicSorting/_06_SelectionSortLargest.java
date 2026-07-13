package _10_BasicSorting;

import java.util.Scanner;

public class _06_SelectionSortLargest {
    public static void selectionSortLargest(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            int max = arr[0];   // start with first element
            int index = 0;
            // this will find max
            for(int j=0; j<n-i; j++){
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            // swap with last element
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of elements in the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        selectionSortLargest(n,arr);

        System.out.print("The Sorted Array is : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
