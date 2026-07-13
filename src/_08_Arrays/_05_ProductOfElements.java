package _08_Arrays;

import java.util.Scanner;

public class _05_ProductOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Elements of the Array : ");
        int n = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        int[] arr = new int[n];
        for(int i= 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int product =1;
        for(int i=0; i<n; i++){
            product*=arr[i];
        }
        System.out.print("The product of the Array elements is : "+product);
    }
}
