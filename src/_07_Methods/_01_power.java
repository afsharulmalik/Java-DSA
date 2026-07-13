package _07_Methods;
import java.util.Scanner;
public class _01_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        double n = sc.nextDouble();
        System.out.print("Enter the power : ");
        double p = sc.nextDouble();
        System.out.println(Math.pow(n, p));        // inbuilt function
        System.out.println(Math.sqrt(9)); //3
        System.out.println(Math.cbrt(8)); //2
        System.out.println(Math.abs(-67));   // negative ko +ve bnaa deta hai
        System.out.println(Math.floor(-3.14));  // -4
        System.out.println(Math.max(54.89, 98)); //98
        System.out.println(Math.min(7, 4)); //4
        System.out.println(Math.max(4, Math.max(5,6))); //6
    }
}
