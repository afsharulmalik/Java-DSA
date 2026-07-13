package _04_Strings;
import java.util.*;
public class stringsBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next(); // ye krne se sirf 1st word print hoga mtlb space ke baad wala sb chorh deta hai
        System.out.print("Enter any line : ");
        String s = sc.nextLine(); // ye krne se poori line print hogi mtlb beech mein kitna bhi space de do sb print krwaa dega
        System.out.println(s);
    }
}
