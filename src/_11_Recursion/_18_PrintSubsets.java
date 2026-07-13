package _11_Recursion;

public class _18_PrintSubsets {
    public static void subsets(String ans, String s, int idx){
        if(idx==s.length()){
            System.out.print(ans+" ");
            return;
        }
        // pick and skip ka concept
        char ch = s.charAt(idx);
        subsets(ans+ch, s, idx+1); // pick karne ke liye
        subsets(ans, s, idx+1);  // skip karne ke liye
    }
    public static void main(String[] args) {
        String s = "abc";
        subsets(" ",s,0);
    }
}
