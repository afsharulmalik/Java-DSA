package _06_PatternPrinting;

import java.util.Scanner;

public class _18_starTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n; j++){
//                if(i+j<=n){
//                    System.out.print("  ");
//                } else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){  // spaces wala loop
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){  // printing wala loop
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// upar wala comment out v iska ek solution hi hai

//this pp is a mixture of star triangle ulta and star triangle we change some basic
// operation on it to print this type of triangle