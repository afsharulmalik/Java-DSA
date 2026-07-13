package _08_Arrays;

import java.util.Scanner;

public class _21_WaveArray {

    // Given a sorted array arr[] of distinct integers. Sort the array into a wave like array(inPlace).
    // in other words, arrange the elements into a sequence such that arr[1]>=arr[2]<=arr[3]>= arr[4] <=arr[5].........
    // if there are multiple solutions. find the lexicographically smallest one.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements in the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Algorithm
        for(int i=0; i<n; i+=2){
            if(i==arr[n-1]) break;    // either we can use break statement or we can take the loop to n-1
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

//        System.out.println(arr[i]);
        System.out.print("The required Wave Array is : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
