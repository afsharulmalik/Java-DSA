package _17_Stacks;

import java.util.Stack;

public class _01_BasicsOfStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Afsharul");
        st.push("Malik");
        st.push("Memes");
        st.push("Moon");
        st.push("Vibes");
        System.out.println(st);  // [Afsharul, Malik, Memes, Moon, Vibes]    Auxiliary Space :- 0(n)
        System.out.println(st.size());  // 5
        System.out.println(st.peek());  // Vibes
        st.pop();
        st.pop();
        System.out.print(st.peek());  // Memes
    }
}
