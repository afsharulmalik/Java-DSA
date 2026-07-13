package _07_Methods;

public class _11_returnKeyword {
    public static void greet(int time){
        if(time < 0) return;
        System.out.println("Good Morning");
    }
    public static void main(String[] args) {
        greet(6);
    }
}
