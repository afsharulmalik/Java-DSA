package _13_Strings;

public class _15_MostFrequentCharacter {
    public static void main(String[] args) {
        String s = "afsharul";

        // Method 1
//        int n = s.length();
//        int max =0;
//        for(int i=0; i<n; i++){
//            int count =0;
//            for(int j=0; j<n; j++){
//                if(s.charAt(i)==s.charAt(j)) count++;
//            }
//            if(count>max) max = count;
//        }
//        System.out.print(max);

        // Method 2  online coding platform par chalega ye basss
//        int n = s.length();
//
//        int[] freq = new int[26];
//
//        for (int i = 0; i < n; i++) {
//            char ch = s.charAt(i);
//            int idx = ch - 'a';
//            freq[idx]++;
//        }
//
//        int maxFreq = 0;
//        char ans = s.charAt(0);
//
//        for (int i = 0; i < 26; i++) {
//            if (freq[i] > maxFreq) {
//                maxFreq = freq[i];
//                ans = (char)(i + 'a');
//            }
//        }
//
//        return ans;
    }
}
