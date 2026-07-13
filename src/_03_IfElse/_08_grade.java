package _03_IfElse;

import java.util.Scanner;

public class _08_grade {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the percentage : ");
            int p = sc.nextInt();
            if (p > 90) {
                System.out.println("Excellent");
            } else if (p > 80) {
                System.out.println("Very good");
            } else if (p > 70) {
                System.out.println("Good");
            } else if (p > 60) {
                System.out.println("Can do better");
            } else if (p > 50) {
                System.out.println("Average");
            } else if (p > 40) {
                System.out.println("Below Average");
            } else {
                System.out.println("Mttt kr bhyii tu");
            }
        }
    }
}
