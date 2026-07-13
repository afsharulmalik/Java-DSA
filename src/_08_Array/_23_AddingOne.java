package _08_Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _23_AddingOne {
    public static void main(String[] args) {

        // Search this Question on gfg (Geeks For Geeks).

        // Q. Given a non-negative integer(without leading zeroes) represented as an array arr.
        // Your task is to add 1 to the number (increment the number 1).
        // The digits are stored such that the most significant digit is at the starting index of the array.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Algorithm
        ArrayList<Integer> ans = new ArrayList<>();
        int carry =1;
        for(int i=n-1; i>=0; i--){
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry =0;
            }else{
                ans.add(0);
                carry =1;
            }
        }
        if(carry==1){
            ans.add(1);
        }

        Collections.reverse(ans);
        System.out.print(ans);
    }
}

// ye question array se v solve ho sktaa hai maine leetcode par solve kiya hai array ka use krke and woh concept iss arraylist wale se easy hai i think
