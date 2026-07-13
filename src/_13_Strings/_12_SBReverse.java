package _13_Strings;

public class _12_SBReverse {
    public static void main(String[] args) {
        String str = "afsharul";
        StringBuilder s = new StringBuilder(str);
        // reverse
        int i=0;
        int j = s.length()-1;
        while (i<j){
            char temp1 = s.charAt(i);
            char temp2 = s.charAt(j);
            s.setCharAt(i,temp2);
            s.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.print(s);
    }
}
// s.delete and s.insert