package _05_Loops;

import java.util.Scanner;

public class productOfNonZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int product = 1;
        boolean flag = false;  // it means ke hum maan rhe hai ek v zero nahi hai
        while(n!=0){
            int lastDigit = n%10;
            if(lastDigit!=0){
                product *= lastDigit;
                flag = true;   // update kr diye taaki zero ho toh skip kr de
            }
            n/= 10;
        }
        System.out.println("The product of non zero digits are "+product);
    }
}
