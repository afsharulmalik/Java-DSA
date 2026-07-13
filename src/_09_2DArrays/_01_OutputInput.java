package _09_2DArrays;

import java.util.Scanner;

public class _01_OutputInput {
    public static void main(String[] args) {
//        int[][] arr = {{5,6,3,1,3},{3,5,6,0,9},{2,6,0,8,5}};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int r = sc.nextInt();

        System.out.print("Enter no of columns : ");
        int c = sc.nextInt();

        System.out.println("Enter Matrix elements below : ");
        int[][] arr = new int[r][c];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The inputted Matrix is : ");
        for(int i=0; i<arr.length; i++){         // this loop traverse in the row form
            for(int j=0; j<arr[0].length; j++){       // this loop traverse in the column form
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
