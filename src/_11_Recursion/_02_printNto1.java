package _11_Recursion;

public class _02_printNto1 {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
