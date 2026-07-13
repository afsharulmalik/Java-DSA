package _13_Strings;

public class _11_StringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();  // iski by default capacity 16 hoti h aur iski help se string ko modify kar sktee hai
        System.out.println(s.length()+" "+s.capacity());  // capacity khud se v de sktee hai
        // this is like a character arraylist
        s.append("Moon");
        s.setCharAt(1,'e');
        System.out.print(s);
    }
}
