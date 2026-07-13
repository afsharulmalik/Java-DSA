package _05_Loops;

import java.util.Scanner;

public class factorialOfFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
            System.out.println("The factorial of "+i+" is "+fact);
        }
    }
}
