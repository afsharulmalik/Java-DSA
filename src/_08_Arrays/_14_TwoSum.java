package _08_Arrays;

import java.util.Scanner;

public class _14_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements in the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter elements of the Array : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target element : ");
        int target = sc.nextInt();

        int [] ans = new int[2];

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    ans[0] =i;
                    ans[1] =j;
                    break;
                }
            }
        }
        System.out.println("The index of the element whose sum is equal to target is : "+"["+ans[0]+" "+ans[1]+"]");
    }
}
