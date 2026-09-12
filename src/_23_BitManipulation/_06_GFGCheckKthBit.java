package _23_BitManipulation;

public class _06_GFGCheckKthBit {
    class CheckBit {
        static boolean checkKthBit(int n, int k) {
            return ((n>>k) % 2 == 1);
        }
    }
}
