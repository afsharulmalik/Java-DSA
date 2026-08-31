package _22_Sets_And_Maps;

import java.util.HashMap;
import java.util.HashSet;

public class _12_LC349IntersectionOf2Arrays {
    /*
    Tumhe dono arrays ka intersection return karna hai.
    Intersection ka matlab?
    Jo elements dono arrays mein present hain, unhe return karna hai.
    Important: Har element ko answer mein sirf ek baar include karna hai,
    chahe woh kisi array mein kitni bhi baar present ho.

    Is question ko dekhte hi socho: **hume dono arrays ke common elements chahiye,
    aur duplicates ko ignore karna hai.** Isliye pehle `nums1` ke elements ko `HashSet`
    mein store kar do, kyunki Set automatically duplicates hata dega. Phir `nums2` par traverse
    karo aur har element ke liye check karo ki woh `Set` mein present hai ya nahi. Agar present hai,
    toh woh intersection ka element hai, isliye answer mein add kar do. Lekin kyunki `nums2` mein bhi
    duplicate ho sakta hai, answer ko bhi `HashSet` mein rakhna convenient rahega.
    Basically **Set 1 → nums1 ke unique elements, Set 2 → common elements**.
     */
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> ans = new HashSet<>();
            for(int num : nums1) set.add(num);
            for(int ele : nums2){
                if(set.contains(ele)) ans.add(ele);
            }
            int[] result = new int[ans.size()]; // converting hashset into array coz of return type
            int i =0;
            for(int ele : ans) result[i++] = ele;
            return result;
        }
    }
}
