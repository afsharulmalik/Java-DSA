package _07_Methods;

public class scopeOfVariable {
    // local variable : jo main function ke andar ho
    // global variable : class mein ho main se bahar
    // priority of local variable is more than global variable
    static int i;
    public static void main(String[] args) {
        i = 19;
        System.out.println(i);
        int i = 67;
        System.out.println(i);
        fun();
    }
    public static void fun(){
        System.out.println(i);
        int i = 80;
        System.out.println(i);
    }
}
