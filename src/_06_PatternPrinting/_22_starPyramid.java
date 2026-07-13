package _06_PatternPrinting;

import java.util.Scanner;
// in nth row, '2*i-1' stars are printed
public class _22_starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){  // spaces wala loop
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){  // printing wala loop
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //2*i-1 wala concept lagega isme
}

//        int n=5;
//    for(int i=1; i<=n; i++){
//        for(int j=1; j<=n-i; j++){
//        System.out.print("  ");
//      }
//              for(int j=1; j<=i; j++){
//        System.out.print("* ");
//      }
//              for(int j=2; j<=i; j++){
//        System.out.print("* ");
//      }
//              System.out.println();
//    }

// isme bass ek extra loop chal rha hai baaki ka star print karne ke liye ye optimal solution nahi hai but issey kaam chal jaayega
// ye solution bss easy hai bina maths ka samazne ke liye baaki main solution toh whi hai upar wala


/*
Output

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */
