package _23_BitManipulation;

public class _10_GFGSetRightMostUnsetBit {
    class Solution {
        public int setBit(int n) {
            return n | n+1;
        }
    }
}
