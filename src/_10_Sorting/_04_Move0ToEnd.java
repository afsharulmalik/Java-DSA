package _10_Sorting;

import java.util.Scanner;

public class _04_Move0ToEnd {
    // This code will works on offline compiler and online compiler without any problem but will
    // give time limit exceeded problem on leetcode, gfg and code force.

    public static void moveToEnd(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    // This code is for gfg, leetcode and code chef

//    public static void moveToEnd(int n, int[] arr){
//        int j=0;
//        for(int i=0; i<n; i++){
//            if(arr[i]!=0){
//                if(i!=j){
//                    int temp= arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//                j++;
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements in the Array : "); // 8
        int n = sc.nextInt();

        System.out.print("Enter Array elements : ");   // {1 2 0 4 3 0 5 0}
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        moveToEnd(n, arr);

        System.out.print("The demanded output is : ");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}


// expected time complexity : 0(n)
// auxiliary space : 0(1)