package _03_IfElse;

import java.util.Scanner;

public class _09_greatestOf3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the 1st number : ");
            int a = sc.nextInt();
            System.out.println("Enter the 2nd number : ");
            int b = sc.nextInt();
            System.out.println("Enter 3rd number : ");
            int c = sc.nextInt();
            if(a>b && a>c){
                System.out.println(a+ "is largest");
            } else if (b>a && b>c){
                System.out.println(b+ "is largest");
            } else {
                System.out.println(c+ "is largest");
            }
        }
    }
}
