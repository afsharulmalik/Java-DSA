package _23_BitManipulation;

public class _08_GFGUnsetKthBit {
    class Solution {
        int replaceBit(int n, int k) {
            return (n & (~1<<(k-1)));
        }
    }
}
