package _02_CharDataType;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);
            System.out.println("Character: " + ch);
            int x = (int) ch;
            System.out.println("ASCII value: " + x);
        }
    }
}
