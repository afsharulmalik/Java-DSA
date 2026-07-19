package _14_CyclicSort;

public class _06_LC287FindTheDuplicateNumber {
    public int findDuplicate(int[] nums){
        int i =0;
        int n = nums.length;
        while(i<n){
            if(nums[i] != i+1){
                int currentIdx = nums[i]-1;
                if(nums[i] != nums[currentIdx]){
                    int temp = nums[i];
                    nums[i] = nums[currentIdx];
                    nums[currentIdx] = temp;
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
