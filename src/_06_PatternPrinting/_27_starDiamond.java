package _06_PatternPrinting;

import java.util.Scanner;

public class _27_starDiamond {
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
            nst+=2;  // jab n =4 lenge toh yahaa tk 7 staar print huaa and iske aage wale loop mein 9 hota
            System.out.println();
        }
        nsp = 1;
//        nst =2*n-3;
        nst = nst-4; // 9 star print hone wala tha but hume 5 chaiye tha isi liye 4 se substract kiye
        for(int i =1; i<=n-1; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
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
  * * * * * * * * * * *
* * * * * * * * * * * * *
  * * * * * * * * * * *
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *

 */
