package _15_OOPSinJava;

class Fraction {
    int num;
    int den;
    Fraction(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.num = num;
        this.den = den;
        simplify();
    }

    void print() {
        System.out.println(num + "/" + den);
    }

    void add(Fraction f) {
        num = num * f.den + den * f.num;
        den = den * f.den;
        simplify();
    }

    void multiply(Fraction f) {
        num = num * f.num;
        den = den * f.den;
        simplify();
    }

    void division(Fraction f) {
        if (f.num == 0) {
            System.out.println("Division by zero is not possible.");
            return;
        }
        num = num * f.den;
        den = den * f.num;
        simplify();
    }

    void simplify() {
        int gcd = hcf(Math.abs(num), Math.abs(den));
        num /= gcd;
        den /= gcd;
    }

    int hcf(int a, int b) {
        if (b == 0) return a;
        return hcf(b, a % b);
    }
}

public class _10_FractionClass {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(3, 7);
        Fraction f2 = new Fraction(7, 3);

        f1.print();
        f2.print();

        Fraction f3 = new Fraction(50, 100);
        f3.print();     // 1/2

        f1.add(f2);
        f1.print();     // 58/21

        f1.multiply(f2);
        f1.print();

        f1.division(f2);
        f1.print();
    }
}