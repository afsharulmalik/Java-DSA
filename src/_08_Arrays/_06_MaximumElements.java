package _08_Arrays;

import java.util.Scanner;

public class _06_MaximumElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Array elements : ");
        int n = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        int[] arr = new int[n];
        for(int i= 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print("The maximum element is : "+max);
    }
}
