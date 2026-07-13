package _07_Methods;

public class _03_swapFunction {
    public static void swap(int a, int b){
        a = a^b;   // a+b
        b = a^b;   // a-b
        a = a^b;   // a-b
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        swap(a,b);
    }
}
