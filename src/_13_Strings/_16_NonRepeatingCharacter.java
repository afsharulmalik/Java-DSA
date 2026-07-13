package _13_Strings;

public class _16_NonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabbcccddddddefffffff";
        int[] freq = new int[26];

        // Count frequency
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        // finding first non repeating
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-'a']==1){
                System.out.print(s.charAt(i));
                return;
            }
        }
        System.out.println("No Non Repeating Character");
    }
}
