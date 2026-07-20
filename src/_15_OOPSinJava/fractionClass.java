package OOPSinJava;

import java.util.Scanner;

public class fractionClass {


    // This is for the multiplication of two Fraction !!!
    public static Fraction multiply(Fraction f1, Fraction f2){
        int f5numerator = f1.numerator*f2.numerator;
        int f5denominator = f1.denominator*f2.denominator;
        Fraction f5 = new Fraction(f5numerator, f5denominator);
        return f5;
    }

    // This is for substracting two Fraction !!!
    public static Fraction substract(Fraction f1, Fraction f2){
        int f4numerator = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int f4denominator = f1.denominator*f2.denominator;
        Fraction f4 = new Fraction(f4numerator, f4denominator);
        return f4;
    }

    // This is for adding two fraction !!!
    public static Fraction add(Fraction f1, Fraction f2){
        int f3numerator = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
        int f3denominator = f1.denominator*f2.denominator;
        Fraction f3 = new Fraction(f3numerator, f3denominator);
        return f3;
    }

    // hcf nikalne ke liye ye function bnaya gyaa hai !!!
    public static int gcd(int numerator, int denominator){
        int min = Math.min(numerator, denominator);
        for(int i= min; i>=1; i--){
            if(numerator%i ==0 && denominator%i ==0) return i;
        }
        return min;
    }

    // Ye ek class hai jo fraction ka value le rha hai !!!
    public static class Fraction {
        int numerator;
        int denominator;

        // This is a constructor !!!
        public Fraction(int numerator, int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }

        // simplify karne ke liye ye function bnaya gyaa hai !!!
        public void simplify(){
            int hcf = gcd(numerator,denominator);
            numerator /= hcf;
            denominator /= hcf;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fraction f1 = new Fraction(35,21);
        System.out.println(f1.numerator+"/"+f1.denominator);
//        f1.simplify();
//        System.out.println(f1.numerator+"/"+f1.denominator);

        Fraction f2 = new Fraction(7,3);
        System.out.println(f2.numerator+"/"+f2.denominator);
//        f2.simplify();
//        System.out.println(f2.numerator+"/"+f2.denominator);

        // This is going to be the Fraction f3 which is performing addition
        Fraction f3 = add(f1, f2);
        System.out.println(f3.numerator+"/"+f3.denominator);

        // This is going to be the Fraction f4 which is performing substraction
        Fraction f4 = substract(f1, f2);
        System.out.println(f4.numerator+"/"+f4.denominator);

        // This is going to be the Fraction f5 which is performing multiplication
        Fraction f5 = multiply(f1,f2);
        System.out.println(f5.numerator+"/"+f5.denominator);
    }
}
