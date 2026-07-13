package _10_BasicSorting;

import java.util.Arrays;
import java.util.Scanner;

public class _07_TwoSum {
    // method for two sum
    public static boolean twoSum(int n, int target, int[] arr){
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        boolean found = false;
        while (i<j){
            int sum = arr[i] + arr[j];
            if(sum==target){
                System.out.print("Pair found : "+ arr[i] + "+" + arr[j] +" = "+target);
                found = true;
                i++;
                j--;
            } else if (sum > target) j--;
             else i++;
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Target to search : ");
        int target = sc.nextInt();


        // calling function
        boolean result = twoSum(n, target, arr);

        if(!result){
            System.out.print("The pair of target is not available.");
        }
    }
}
