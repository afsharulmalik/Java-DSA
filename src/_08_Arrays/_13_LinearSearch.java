package _08_Arrays;

import java.util.*;


public class _13_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input of array size
        System.out.print("Enter no of elements in the Array : ");
        int n = sc.nextInt();

        // taking array input
        System.out.print("Enter Array Elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // taking target element
        System.out.print("Enter an element to be searched : ");
        int target = sc.nextInt();

        // Algorithm
        boolean found = false;
        for(int i=0; i<n; i++){
            if(arr[i]==target){
                System.out.print("Target exist in the Array at index : "+i);
                found = true;
                break;
            }
        }
        // condition check ho rha hai
        if(!found){
            System.out.print("Target doesn't exist in the Array.");
        }
    }
}
