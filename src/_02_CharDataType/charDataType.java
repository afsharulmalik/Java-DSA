package _02_CharDataType;

import java.util.Scanner;

public class charDataType {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter ur name : ");
            int a = sc.nextInt();
            System.out.println(a);
        }
    }
}
