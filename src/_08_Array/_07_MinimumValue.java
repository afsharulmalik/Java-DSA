package _08_Array;

import java.util.Scanner;

public class _07_MinimumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Array Elements : ");
        int n = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0; i<n; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.print("Minimum Array Elements is : "+min);
    }
}
