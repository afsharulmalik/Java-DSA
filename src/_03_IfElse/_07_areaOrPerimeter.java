package _03_IfElse;

import java.util.Scanner;

public class _07_areaOrPerimeter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length : ");
            int l = sc.nextInt();
            System.out.print("Enter the breadth : ");
            int b = sc.nextInt();
            int area = l*b;
            int perimeter = 2*(l+b);
            System.out.println("The area of the rectangle is "+area);
            System.out.println("The perimeter of the rectangle is "+perimeter);
            if(area>perimeter){
                System.out.println("Area is greater than the perimeter");
            } else if (perimeter>area){
                System.out.println("Perimeter is greater than the area");
            } else {
                System.out.println("Area is equal to Perimeter");
            }
        }
    }
}
