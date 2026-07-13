package _00_BasicsOfJava;

public class multipleVariable {
    public static void main(String[] args) {
        int x=5,y=6,z=2;
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);
        System.out.println("The value of z is "+z);
        System.out.println(x+y+z);
        System.out.println(""+x+y+z);    // 562
        // jase hi double quotes aayega uske aage wala bhi text bnn jaayega
        System.out.println(x+y+""+y+z);
        // saari cheez left to right hoti hai
        System.out.println("Hello bee"+" Hello Ree");
    }
}
