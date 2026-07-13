package _04_Strings;

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder("Malik");
        System.out.println(str);
        str.append(" Afsharul");
        System.out.println(str);

        // .setCharAt()  // string ke character ko change krta hai 
        str.setCharAt(4,'c');
        System.out.println(str);

        // .append()  // phle wali string ke saath hi new string ko attach kar deta hai
        str.append(4);
        System.out.println(str);

        // .insert() : this insert a char int or any other data type at this index without replacing the word
        str.insert(2,'y');
        System.out.println(str);

        // .deleteCharAt()
        str.deleteCharAt(3);
        System.out.println(str);

        // REVERSE

        StringBuilder s = new StringBuilder("Afsharul");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
        s.reverse();
        System.out.println(s);

        // DELETE

        s.delete(1,4); // last ko include nahi krta hai
        System.out.println(s);
    }
}
