package _08_Arrays;

import java.util.Scanner;

public class _04_SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.print("The sum of Array Elements are : "+sum);
    }
}
