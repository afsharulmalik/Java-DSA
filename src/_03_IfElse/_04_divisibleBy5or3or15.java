package _03_IfElse;

import java.util.Scanner;

public class _04_divisibleBy5or3or15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if(n%3==0 || n%5==0){
                if(n%15!=0){
                    System.out.println("The number is divisible by 5 or 3 but not by 15");
                } else {
                    System.out.println("The condition is not satisfied");
                }
            } else {
                System.out.println("The condition is not satisfied");
            }
        }
    }
}
