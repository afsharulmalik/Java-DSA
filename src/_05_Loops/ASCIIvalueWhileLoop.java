package _05_Loops;

public class ASCIIvalueWhileLoop {
    public static void main(String[] args) {
        int n = 65;
        while (n!=91){
            System.out.println((char)n+" --> "+n);
            n++;
        }

        System.out.println();   // space between lines

        int a = 97;
        while (a!=123){
            System.out.println((char)a+" --> "+a);
            a++;
        }
    }
}
