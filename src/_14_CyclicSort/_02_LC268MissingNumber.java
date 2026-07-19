package _14_CyclicSort;

public class _02_LC268MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int correctIdx = nums[i];
            if(nums[i] < n && nums[i] != nums[correctIdx]){
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }else{
                i++;
            }
        }
        for(int j=0; j<n; j++){
            if(j!=nums[j]) return j;
        }
        return n;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};

    }
}
