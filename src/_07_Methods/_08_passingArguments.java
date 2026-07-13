package _07_Methods;

// When you call a method, you can send values to it. These values are called arguments, and they are received as parameters in the method.

public class _08_passingArguments {
    public static void greet(String name){
        System.out.println("Good Morning "+name);
    }
    public static void main(String[] args) {
        greet("Moon");
    }
}
