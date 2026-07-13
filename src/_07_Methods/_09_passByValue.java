package _07_Methods;

// 🔸 Value is copied, original a is unchanged.

public class _09_passByValue {
    static void changeValue(int x) {
        x = 10;
    }

    public static void main(String[] args) {
        int a = 5;
        changeValue(a);
        System.out.println(a); // Still prints 5
    }
}
