package _09_2dArrays;

import java.util.Scanner;

public class _06_ColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter the no of rows : ");
//        int r = sc.nextInt();   // 4
//        System.out.print("Enter the no of columns : ");
//        int c = sc.nextInt();   // 5
//
//        System.out.println("Enter the Matrix : ");
//        int[][] arr = new int[r][c];
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[0].length; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }

        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,9,9,1,4},{3,1,8,2,6}};

        // Printing Column Wise

        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
