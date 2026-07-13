package _13_Strings;

public class _13_InterningNew {

    // khud ka method for checking if two string is equal
    public static boolean isEqual(String s5, String s6){
        if(s5.length()!=s6.length()) return false;
        for(int i=0; i<s5.length(); i++){
            if(s5.charAt(i)!=s6.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "Afsharul";
        String s2 = "Afsharul";
        System.out.println(s1.equals(s2));  // this will return true because ye s1 aur s2 ek hi string ko point kar rha hai

        String s3 = new String("Afsharul");
        String s4 = new String("Afsharul");
        System.out.println(s3==s4);  // ye false return karega bcoz yhaa dono string new keyword use krke banaa hai jiska
        // mtlb hai k dono string par equals operation use krne par dono ka address compare hoga jo ki obvious hai diiifferent hai

        String s5 = "Moon";
        String s6 = "Chand";
        System.out.println(isEqual(s5,s6));
    }
}
