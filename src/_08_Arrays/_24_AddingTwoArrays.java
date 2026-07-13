package _08_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class _24_AddingTwoArrays {
    public static void main(String[] args) {

        // {3,5,2,8,7} + {9,2,1} = {3,6,1,2,8}

        Scanner sc = new Scanner(System.in);

        // Taking input of Array 1
        System.out.print("Enter no of elements of arr1 = ");
        int n1 = sc.nextInt();

        System.out.print("Enter elements of arr1 : ");
        int[] arr1 = new int[n1];
        for (int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }

        // Taking input of Array 2
        System.out.print("Enter no of elements of arr1 = ");
        int n2 = sc.nextInt();

        System.out.print("Enter elements of arr1 : ");
        int[] arr2 = new int[n1];
        for (int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }

        int carry =1;
        ArrayList<Integer> ans = new ArrayList<>();

    }
}
