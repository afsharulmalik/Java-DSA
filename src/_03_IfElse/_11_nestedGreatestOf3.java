package _03_IfElse;

import java.util.Scanner;

public class _11_nestedGreatestOf3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the 1st number : ");
            int a = sc.nextInt();
            System.out.print("Enter the 2nd number : ");
            int b = sc.nextInt();
            System.out.print("Enter 3rd number : ");
            int c = sc.nextInt();

            // conditions
            if(a>b){
                if(a>c){
                    System.out.println(a+" is largest");
                } else {
                    System.out.println(c+" is largest");
                }
            } else {
                if(b>c){
                    System.out.println(b+" is largest");
                } else {
                    System.out.println(c+" is largest");
                }
            }
        }
    }
}
