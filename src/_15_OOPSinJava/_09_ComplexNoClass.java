package _15_OOPSinJava;

class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y>0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }
}
public class _09_ComplexNoClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2,5);
        z1.print();
        ComplexNumber z2 = new ComplexNumber(3, -5);
        z2.print();
    }
}
