package _10_BasicSorting;

import java.util.Scanner;

public class _10_KthSmallest {
    public static int kthelement(int n, int[] arr,int k){
        for(int i=0; i<k; i++){
            int min = arr[i];
            int index = i;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            // ab swap karenge
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements in the Array : ");
        int n = sc.nextInt();

        System.out.print("Enter Array elements : ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k : ");
        int k = sc.nextInt();

        kthelement(n,arr,k);

        System.out.print("The required smallest element in the array is "+arr[k-1]);
    }
}
