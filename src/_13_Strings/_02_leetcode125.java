package _13_Strings;

public class _02_leetcode125 {
    // Valid Palindrome

    // not an optimal solution but not a basics too because it make new string
    class Solution {
//        public boolean isPalindrome(String s) {
//
//            // Yahaa regular expression ka use krke solve huaa hai aur ^ ye ek Regex hai means regular expression
//            // yhaa par replace all ne jo v empty spaces hai aur special character hai unn sab ko empty string mein daal diya hai jiska seedha mtlb hai woh sab delete ho gyaa hai
//            s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
//            int i=0;
//            int j=s.length()-1;
//            while(i<j){
//                if(s.charAt(i)!=s.charAt(j)) return false;
//                i++;
//                j--;
//            }
//            return true;
//        }


        // Most optimal solution
//        int i=0;
//        int j=s.length()-1;
//        while(i<j){
//            int leftChar = s.charAt(i);
//            int rightChar = s.charAt(j);
//            if(!Character.isLetterOrDigit(leftChar)){  // iss line ka mtlb hai k agar char letter ya digit  nahi hai toh skip kardo
//                i++;
//                continue;
//            }
//            if(!Character.isLetterOrDigit(rightChar)){  // iska v same hi h  bss right side check karega
//                j--;
//                continue;
//            }
//            if(Character.toLowerCase(leftChar)!=Character.toLowerCase(rightChar)) return false;
//            i++;
//            j--;
//        }
//        return true;
    }
}
