package _10_BasicSorting;

import java.util.Scanner;

public class _03_BubbleSortDescending {

    public static void bubbleSortDescending(int n, int[] arr){
        boolean swapped;
        for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements in the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSortDescending(n,arr);

        System.out.print("The sorted Array is : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
