package _14_CyclicSort;

public class _05_LC645SetMismatch {
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int n = nums.length;
            int i = 0;
            while(i<n){
                int correctIdx = nums[i]-1;
                if(nums[i] != nums[correctIdx]){
                    int temp = nums[i];
                    nums[i] = nums[correctIdx];
                    nums[correctIdx] = temp;
                }else{
                    i++;
                }
            }
            for(int j=0; j<n; j++){
                if(nums[j] != j+1){
                    return new int[]{nums[j], j+1};
                }
            }
            return new int[]{-1, -1};
        }
    }
    public static void main(String[] args) {

    }
}

// Approach
// pehle repeated element search karenge jaise hi mil jaayega obvious hoga uske baad wala hi element missing hoga array se
