package _15_OOPSinJava;

class ComplexNumber{
    double x;
    double y;
    ComplexNumber(double x, double y){
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y>0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }
    void add(ComplexNumber z) {
        this.x += z.x;
        this.y += z.y;
    }

    void multiply(ComplexNumber z) {
        x = x*z.x - y*z.y;
        y = x*z.y + y*z.x;
    }

    void division(ComplexNumber z) {

    }
}
public class _09_ComplexNoClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2,9);
        ComplexNumber z2 = new ComplexNumber(3, -5);
        z1.print(); z2.print();  // this will print complex number

        // Addition of complex number
        z1.add(z2);
        z1.print();  // this will print the sum of complex number
        z2.print();  // this will print actual value of z2

        // Multiplication of complex number
        z1.multiply(z2);
        z1.print();  // this will print the multiplication of complex number
        z2.print();  // this will print actual value of z2

        // Division of complex number
        z1.division(z2);
        z1.print();  // this will print the division of complex number
        z2.print();  // this will print actual value of z2
    }
}
