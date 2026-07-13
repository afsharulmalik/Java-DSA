package _01_TakingInput;

import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the radius : ");
            double r = sc.nextDouble();
            double pi = 3.1415;
            double area = pi*r*r;
            System.out.println("The area of the circle is "+area);
        }
    }
}
