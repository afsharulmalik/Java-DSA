package _06_PatternPrinting;

import java.util.Scanner;

//nst -> number of stars
//nsp -> number of spaces
public class _23_starPyramidMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int nst =1;  // 1st line mein ek star hoga hi isiliye 1
        int nsp =n-1;  // spaces every increasing line mein ek se ghat rha hai
        for(int i =1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}


/*
output

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */
