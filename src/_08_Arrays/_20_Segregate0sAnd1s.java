package _08_Arrays;

import java.util.Scanner;

public class _20_Segregate0sAnd1s {
    public static void main(String[] args) {
        // Given an array arr consisting of only 0's and 1's in random order.
        // Modify the array in place to segregate os onto the left side and 1s onto the right sideof the array.

        // arr = {0,0,1,1,0} output -> {0,0,0,1,1}

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements in the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Algorithm (ye basic wala hai )
//        int noOfZeroes =0;
//        for(int ele : arr){
//            if(ele == 0){
//                noOfZeroes++;
//            }
//        }
//
//        for(int i=0; i<noOfZeroes; i++){
//            arr[i] = 0;
//        }
//        for(int i=noOfZeroes; i<n; i++){
//            arr[i] = 1;
//        }

        // Alternate method (this is more precise because of less time complexity )
        int i=0;
        int j=n-1;

        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }

        // for printing the output array
        System.out.print("Array after Segregation is : ");
        for(i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
