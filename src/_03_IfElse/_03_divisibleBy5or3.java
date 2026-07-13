package _03_IfElse;

import java.util.Scanner;

public class _03_divisibleBy5or3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number : ");
            int num = sc.nextInt();
            if(num%5==0 || num%3==0){
                System.out.println("The number is divisible by 5 or 3");
            } else {
                System.out.println("The number is not divisible by either 3 or 5");
            }
        }
    }
}
