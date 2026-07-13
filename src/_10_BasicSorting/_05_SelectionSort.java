package _10_BasicSorting;

import java.util.Scanner;

public class _05_SelectionSort {
    public static void selectionSort(int n, int[] arr){
        for(int i=0; i<n-2; i++){
            int min = arr[i];
            int index = i;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            // ab swap karenge
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(n, arr);

        System.out.print("The sorted Array is : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
