package _05_Loops;

import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int original = n;
        int r = 0;
        while (n!=0){
            int lastDigit = n%10;
            r = r*10+lastDigit;
            n/=10;
        }
        System.out.println("The reverse of "+original+" is "+r);
    }
}
