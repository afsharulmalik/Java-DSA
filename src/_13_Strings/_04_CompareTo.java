package _13_Strings;

public class _04_CompareTo {
    // ye built in method hai lekin hum isko khud se bnaye hai
    public static int compareTo(String a, String b){
        int minLength = Math.min(a.length(),b.length());
        for(int i=0; i<minLength; i++){
            if(a.charAt(i)!=b.charAt(i)){
                return a.charAt(i)-b.charAt(i);
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String a = "gitanjali";
        String b = "moon";
        System.out.print(compareTo(a,b));
    }
}
