package _06_PatternPrinting;

import java.util.Scanner;

public class _05_squareAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

//        j+64 gives capital A
//                for small a add 96
//        agar i+64 karenge toh
//                A A A A
//                B B B B
         //       C C C C
        //        D D D D
    }
}
