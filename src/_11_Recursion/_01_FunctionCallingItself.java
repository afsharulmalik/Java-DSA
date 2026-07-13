package _11_Recursion;

public class _01_FunctionCallingItself {
    public static void main(String[] args) {
        malik(1);
    }
    public static void malik(int n){
        if(n==10) return;
        System.out.println("Babee");
        malik(n+1);
    }
}
