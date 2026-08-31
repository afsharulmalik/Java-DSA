package _22_Sets_And_Maps;

import java.util.HashMap;

public class _10_LC242ValidAnagram {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) return false;
            HashMap<Character, Integer> aMap = new HashMap<>(); // for string s
            HashMap<Character, Integer> bMap = new HashMap<>(); // for string t
            for(char ch : s.toCharArray()){
//                aMap.put(ch, aMap.getOrDefault(ch,0)+1);
                if(aMap.containsKey(ch)) aMap.put(ch,aMap.get(ch)+1);
                else aMap.put(ch,1);
            }
            for(char ch : t.toCharArray()){
                if(bMap.containsKey(ch)) bMap.put(ch,bMap.get(ch)+1);
                else bMap.put(ch,1);
            }
            for(char ch : aMap.keySet()){
                if(!bMap.containsKey(ch) || !aMap.get(ch).equals(bMap.get(ch))) return false;
            }
            return true;
        }
    }
}
