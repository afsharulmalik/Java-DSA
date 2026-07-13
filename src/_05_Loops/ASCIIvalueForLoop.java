package _05_Loops;

public class ASCIIvalueForLoop {
    public static void main(String[] args) {
        for(int i=65; i<=90; i++){
            System.out.println((char)i+" --> "+i);
        }

        System.out.println();    // space between two lines

        for(int i=97; i<=122; i++){
            System.out.println(i+" --> "+(char)i);
        }
    }
}
