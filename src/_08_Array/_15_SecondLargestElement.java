package _08_Array;

import java.util.Scanner;

public class _15_SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of elements in the Array : ");
        int n = sc.nextInt();         //5

        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];    // {4,10,10,6,3}


        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int smax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println("The largest element in the given Array is : "+max);
        System.out.print("The 2nd largest element in the given Array is : "+smax);
    }
}
