package _17_Stacks;
import java.util.*;
public class _12_LC84LargestRectangleInHistogram {
    class Solution {
        public int largestRectangleArea(int[] arr) {
            int n = arr.length;
            int[] nse = new int[n];
            nse[n-1] = n; // last wale ka -1 nahi n le rhe hai calculation purpose ke liye
            Stack<Integer> stack = new Stack<>();
            stack.push(n-1); // idx se kaam kar rhe hai isliye idx push kiya
            for(int i = n-2; i>=0; i--){
                while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
                if(stack.isEmpty()) nse[i] = n;
                else nse[i] = stack.peek();
                stack.push(i);
            }
            while (!stack.isEmpty()) stack.pop();
            int[] pse = new int[n];
            pse[0] = -1;
            stack.push(0);
            for(int i=1; i<n; i++){
                while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
                if(stack.isEmpty()) pse[i] = -1;
                else pse[i] = stack.peek();
                stack.push(i);
            }
            int maxArea = 0;
            for(int i=0; i<n; i++){
                int area = arr[i] * (nse[i]-pse[i]-1);
                maxArea = Math.max(maxArea, area);
            }
            return maxArea;
        }
    }
}
