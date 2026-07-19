package _14_CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class _03_LC448NosDisappeared {
    public List<Integer> findDisappearedNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIdx = nums[i]-1;
            if(nums[i] != nums[correctIdx]){
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
}