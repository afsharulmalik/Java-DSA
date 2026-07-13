package _06_PatternPrinting;

import java.util.Scanner;

public class _12_oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }
    }
}


//method 2
//
//        for(int i =1; i<=n; i++){
//            int a=1;
//            for(int j=1; j<=i; j++){
//                System.out.print(a+" ");
//                a+=2;
//            }
//            System.out.println();
//        }