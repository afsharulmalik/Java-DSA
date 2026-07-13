package _03_IfElse;

import java.util.Scanner;

// Q. Given the coordinates (x,y) of a center of a circle and its radius, wap which
// will determine whether a point lies inside the circle, on the circle or outside the circle.
public class _14_circleCoordinates {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of x : ");
            int x = sc.nextInt();
            System.out.print("Enter the value of y : ");
            int y = sc.nextInt();
            System.out.print("Enter the radius of the circle : ");
            int radius = sc.nextInt();

            // int x, int y and int radius given rahega question mein hi...................

            // ye cheez ka input user se lenge....!!!
            System.out.print("Enter the x-coordinate of the point: ");
            int px = sc.nextInt();
            System.out.print("Enter the y-coordinate of the point: ");
            int py = sc.nextInt();

            // Calculate the squared distance between the point and the center
            int distanceSquared = (px - x) * (px - x) + (py - y) * (py - y);
            int radiusSquared = radius * radius;

            // Determine the position of the point relative to the circle
            if (distanceSquared < radiusSquared) {
                System.out.println("The point lies inside the circle.");
            } else if (distanceSquared == radiusSquared) {
                System.out.println("The point lies on the circle.");
            } else {
                System.out.println("The point lies outside the circle.");
            }
        }
    }
}
