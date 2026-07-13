package _08_Arrays;

import java.util.Scanner;

//Q. Find the doublet in the Array whose sum is equal to the given value x. (Two Sum)

public class twoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers of elements in the Array : ");
        int n = scanner.nextInt();

        // {83,21,38,69,74,12}

        int[] arr = new int[n];
        System.out.print("Enter the elements of the Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Algorithm
        int target = 81;  // this must be given in the question just to neglect the mistake of not finding the pairs
        int [] ans = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j] == target){
                    ans[0] =i;
                    ans[1] =j;
                    break;
                }
            }
        }
        System.out.println("The index of the element whose sum is equal to 81 is : "+"["+ans[0]+" "+ans[1]+"]");
    }
}
