package _04_Strings;

public class stringsOperation {
    public static void main(String[] args) {
        String str = "Afsharul Malik ";
        String atr = "Moon Vibes";

        // length()
        System.out.println(str.length());
//        char ch = str.charAt(3);

        // charAt()
        System.out.println(str.charAt(3));

        // indexof()
        System.out.println(str.indexOf('h'));

        // compareTo()
        // Concept :- lexographically >0 mtlb 1st letter of string compare hota hai
        // if str == atr -> ans: 0 : agar dono same hoga toh 0 agar 1st same hua toh 2nd letter se compare hoga and uss hisab se value dega
        // if str > atr -> ans: +ve or >0
        // if str < atr -> ans: -ve or <0
        System.out.println(atr.compareTo(str));
        System.out.println(str.compareTo(atr));

        // contains() : agar string mein present hoga toh true warna false
        System.out.println(str.contains("rul"));

        // startsWith() : agar isse start hoga toh true else false
        System.out.println(str.startsWith("Afsp"));

        // endsWith() : agar issey end ho rha hoga toh true else false
        System.out.println(str.endsWith("ik"));

        // toLowerCase()
        System.out.println(str.toLowerCase());

        // toUpperCase()
        System.out.println(atr.toUpperCase());

        // concat()
        System.out.println(str.concat(atr));
    }
}
