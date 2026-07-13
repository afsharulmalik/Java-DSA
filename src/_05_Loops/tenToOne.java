package _05_Loops;

import java.util.Scanner;

public class tenToOne {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
//            for(int i = n; i>0; i--){
//                System.out.println(i);
//            }

            //  INCREASING LOOP FOR PRINTING DECREASING NUMBER
//            for(int i=1; i<=n; i++){
//                System.out.print((11-i)+ " ");
//            }

            //  SAME INCREASING LOOP BUT FOR PRINTING 20 18 16 .......... 2
            for(int i=0; i<=n; i+=2){
                System.out.print((22-i) + " ");
            }
        }
    }
}
