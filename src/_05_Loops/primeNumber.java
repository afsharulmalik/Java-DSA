package _05_Loops;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            if (n <= 1) {
                System.out.println(n + " is not a Prime number");
                return;
            }
            if (n == 2) {
                System.out.println(n + " is a Prime number");
                return;
            }
            if (n % 2 == 0) {
                System.out.println(n + " is not a Prime number");
                return;
            }

            boolean isPrime = true;
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }

            if (isPrime) {
                System.out.println(n + " is a Prime number");
            } else {
                System.out.println(n + " is not a Prime number");
            }
        }
    }
}



// Alternate method
//import java.util.Scanner;
//public class PrimeNumber {
//    // Function to check if a number is prime
//    public static boolean isPrime(int n) {
//        if (n <= 1) return false;
//        if (n == 2) return true;
//        if (n % 2 == 0) return false; // Even numbers > 2 are not prime
//
//        for (int i = 3; i * i <= n; i += 2) { // Skip evens
//            if (n % i == 0) return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        if (isPrime(n)) {
//            System.out.println(n + " is a Prime number");
//        } else {
//            System.out.println(n + " is not a Prime number");
//        }
//
//        sc.close();
//    }
//}


