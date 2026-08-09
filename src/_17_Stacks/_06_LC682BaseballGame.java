package _17_Stacks;

import java.util.Stack;

public class _06_LC682BaseballGame {
    class Solution{
        public int calPoints(String[] arr) {
            int n = arr.length;
            Stack<Integer> stack = new Stack<>();
            for(int i=0; i<n; i++){
                String s = arr[i];
                if(s.equals("C")) stack.pop();
                else if(s.equals("D")) stack.push(2*stack.peek());
                else if(s.equals("+")){
                    int top = stack.pop();
                    int sTop = stack.peek();
                    int sum = top + sTop;
                    stack.push(top);
                    stack.push(sum);
                }else{
                    stack.push(Integer.parseInt(s));
                }
            }
            int sum = 0;
            while (stack.size()>0){
                sum += stack.pop();
            }
            return sum;
        }
    }
    public static void main(String[] args) {

    }
}
