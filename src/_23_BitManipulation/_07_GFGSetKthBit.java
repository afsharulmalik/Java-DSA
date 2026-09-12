package _23_BitManipulation;

public class _07_GFGSetKthBit {
    class Solution {
        static int setKthBit(int n, int k) {
            return (n | (1<<k));
        }
    }
}
