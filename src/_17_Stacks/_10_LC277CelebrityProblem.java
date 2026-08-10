package _17_Stacks;
import java.util.*;

// i have solved this question on gfg practice coz premium chaiye tha leetcode par solve karne ke liye

public class _10_LC277CelebrityProblem {
    class Solution {
        public int celebrity(int mat[][]) {
            int n = mat.length;
            Stack<Integer> stack = new Stack<>();
            for(int i=0; i<n; i++){
                stack.push(i);
            }
            while(stack.size()>1){
                int a = stack.pop();
                int b = stack.pop();
                boolean aKnows = true; // a celeb hai
                boolean bKnows = true; // b celeb hai
                if(mat[a][b] == 1) aKnows = false; // a celeb nahi hua
                else bKnows = false;  // b celeb nahi hua
                if(mat[b][a] == 1) bKnows = false; // b celeb nahi hua
                else aKnows = false; // a celeb nahi hua
                if(aKnows) stack.push(a); // a celeb hai
                if(bKnows) stack.push(b); // b celeb hai
            }
            if(stack.isEmpty()) return -1;
            int celeb = stack.pop();  // agar koi element last mein reh gya stack mein
            for(int j=0; j<n; j++){
                if(j==celeb) continue;
                if(mat[celeb][j]==1) return -1;
            }
            for(int i=0; i<n; i++){
                if(i==celeb) continue;
                if(mat[i][celeb]==0) return -1;
            }
            return celeb;
        }
    }
}
