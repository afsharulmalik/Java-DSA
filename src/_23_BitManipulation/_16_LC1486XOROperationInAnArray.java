package _23_BitManipulation;

public class _16_LC1486XOROperationInAnArray {
        class Solution {
            public int xorOperation(int n, int start) {
                int ans = 0;
                for (int i = 0; i < n; i++) {
                    ans ^= start + 2 * i;
                }
                return ans;
            }
        }

        // wrong solution but approach is optimal
//        private int xor(int n) {
//            if(n%4 == 1) return 1;
//            else if(n%4 == 2) return n+1;
//            else if(n%4 == 3) return 0;
//            else return n;
//        }
//        public int xorOperation(int n, int start) {
//            return xor(n-1) ^ xor(start);
//        }
    }

