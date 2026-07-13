package _08_Array;

import java.util.Scanner;

public class _19_MissingInArray {
    public static void main(String[] args) {

//        Q. You are given an array arr[] of size n-1 that contains distinct integers in the range from 1 to n [inclusive].
//        The array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify
//        and return the missing element.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements in Array : ");
        int n = sc.nextInt();

        // Array must be a continuous series of numbers chahe woh idhar udhar hoke rhe ya ek saath series mein rhe
        // arr = {1,2,3,5}   n = 4
        // arr = {8,2,4,5,3,7,1}   n = 7

        // concept : Agar array ka size 4 hai toh number 5 tak hona chaiye tha
        // agar array ka size 20 hai toh number 21 tak hona chaiye tha

        // jab online compiler par karenge toh long data type lenge because no of inputs jo array mein daalega woh
       //  int se bahut badaa hoga........& return v karenge toh woh v type case karna padega as an int variable
        // for type casting ---> return (int)(sum-arraySum)

        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int m = n+1;
        int sum = (m*(m+1))/2;  // 15
//        System.out.println(sum);
        int arraySum = 0;
        for(int ele : arr){
            arraySum+=ele;
        }
//        System.out.println(arraySum);

        int output = sum - arraySum;
        System.out.print("The missing element in Array is : "+output);
    }
}
