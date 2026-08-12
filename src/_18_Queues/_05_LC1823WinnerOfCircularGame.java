package _18_Queues;
import java.util.*;
public class _05_LC1823WinnerOfCircularGame {
    class Solution {
        public int findTheWinner(int n, int k) {
            Queue<Integer> q = new LinkedList<>();
            for(int i=1; i<=n; i++){ // queue mein add ho gya
                q.add(i);
            }
            while(q.size()>1){
                for(int i=0; i<k-1; i++){
                    q.add(q.remove());
                }
                q.remove();  // kth element remove hoga
            }
            return q.peek();
        }
    }


// this is the optimal solution of this pariticular problem
    class OptimalSolution {
        public int findTheWinner(int n, int k) {
            int winner = 0;

            for (int i = 2; i <= n; i++) {
                winner = (winner + k) % i;
            }

            return winner + 1;
        }
    }
}
