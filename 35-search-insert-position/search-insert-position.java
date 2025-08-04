class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length -1;
        int mid = 0;
        int awns = e+1;

        while(s<=e){
            mid = s + (e-s)/2;
            if (nums[mid]>=target){
                awns=mid;
                e = mid-1;;
            }
            else {
                // awns = mid;
                s = mid +1;
                // e = mid -1;
            }
        }
        return awns;
    }
}