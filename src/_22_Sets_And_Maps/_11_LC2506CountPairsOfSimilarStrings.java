package _22_Sets_And_Maps;

import java.util.HashMap;
import java.util.HashSet;

public class _11_LC2506CountPairsOfSimilarStrings {
   /* This is what Question states :-
    Frequency ko ignore karke, sirf ye check karo ki dono strings mein
    kaun-kaun se characters present hain. Phir aise pairs count karo.*/
   class Solution {
       public int similarPairs(String[] words) {
           HashMap<String, Integer> map = new HashMap<>();
           int ans = 0;
           for(String word : words){
               HashSet<Character> set = new HashSet<>();
               for(char ch : word.toCharArray()) set.add(ch);
               String key = ""; //
               for(char ch : set) key+=ch;
               if(map.containsKey(key)) ans+=map.get(key);
               map.put(key, map.getOrDefault(key,0)+1);
           }
           return ans;
       }
   }
}
