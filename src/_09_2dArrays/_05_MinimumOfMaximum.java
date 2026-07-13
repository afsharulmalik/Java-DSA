package _09_2dArrays;

import java.util.Scanner;

public class _05_MinimumOfMaximum {
    public static void main(String[] args) {
//        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,9,9,1,4},{3,1,8,2,6}};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows : ");
        int r = sc.nextInt();   // 4
        System.out.print("Enter the no of columns : ");
        int c = sc.nextInt();   // 5

        System.out.println("Enter the Matrix : ");
        int[][] arr = new int[r][c];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Algorithm

        int minOfMax = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            int rowMax = 0;
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]>rowMax){
                    rowMax = arr[i][j];
                }
            }
            if(rowMax<minOfMax){
                minOfMax = rowMax;
            }
        }
        System.out.print("The minimum element out of all the maximum elements of each row is : "+minOfMax);
    }
}
