package _08_Arrays;

import java.util.Scanner;

public class _03_NegativeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =  sc.nextInt();
        }
        // displaying outputs of the Array
        System.out.print("The Array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        // displaying negative elements of the Array
        System.out.print("Negative Elements are as follows : ");
        for(int i=0; i<n; i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
