package _03_IfElse;

import java.util.Scanner;

public class _15_threeDigitNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any number : ");
            int num = sc.nextInt();
            if(num>99 && num<1000) {
                System.out.println("Entered number is a three digit number");
            } else{
                System.out.println("Entered number is not a three digit number");
            }
        }
    }
}
