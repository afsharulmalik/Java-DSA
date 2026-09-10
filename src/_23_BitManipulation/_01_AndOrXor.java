package _23_BitManipulation;

public class _01_AndOrXor {
    public static void main(String[] args) {
        // and
        System.out.println(51 & 42); // 34
        // or
        System.out.println(51 | 42); // 59

        int x = 5;
        // 1's complement
        System.out.println(~x); // -6
        System.out.println(-x-1); // -6
        // 2's complement
        System.out.println(~x+1); // -5
        System.out.println(-x); // -5
    }
}
