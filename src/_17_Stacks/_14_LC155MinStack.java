package _17_Stacks;
import java.util.*;
public class _14_LC155MinStack {
    // Optimal solution
    // this solution is using a min value jo rollback and fake value wala locha karke solution dega
    class MinStackOptimal {
        Stack<Long> stack;
        long min;
        public MinStackOptimal() {
            stack = new Stack<>();
            min = Long.MAX_VALUE;
        }

        public void push(int val) {
            if(stack.isEmpty()) stack.push((long)val);
            if((long)val >= min) stack.push((long)val);
            else{ // stack mein fake value daalenge
                stack.push(val+(val-min));
                min = (long)val;
            }
        }

        public void pop() {
            if(stack.peek() >= min) stack.pop();
            else{ // locha hai yhaa, min rollback karo
                min = min+(min-stack.peek());
                stack.pop();
            }
        }

        public int top() {
            long a = stack.peek();
            if(a<min){
                return (int)min;
            }else{
                return (int)a;
            }
        }

        public int getMin() {
            return (int)min;
        }
    }

    // this solution is using 2 stack but the interviewer may ask to give optimal solution for this
    class MinStack {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> minSt = new Stack<>();
        public MinStack() {

        }

        public void push(int value) {
            st.push(value);
            if(minSt.isEmpty() || value<minSt.peek()) minSt.push(value);
            else minSt.push(minSt.peek());
        }

        public void pop() {
            st.pop();
            minSt.pop();
        }

        public int top() {
            return st.peek();
        }

        public int getMin() {
            return minSt.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
