package _12_BinarySearch;

public class _04_FloorInSortedArray {

    // this question is available on gfg practice not on leetccode
    // if (arr[mid]>target) go left
    // if(arr[mid]<=target) mark and go right

    public static int findFloor(int[] arr, int target){
        int low = 0;
        int n = arr.length;
        int high = n-1;
        int index = -1;
        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid]>target) high = mid-1;
            else{
                index = mid;
                low = mid+1;
            }
        }
        return index;
    }
}
