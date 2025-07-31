class Solution {
    public int[] searchRange(int[] nums, int target) {
        int range[]= {-1,-1};
        
        if(nums.length == 0){
            return range;
        }
        int s=0;
        int e=nums.length -1;
        int mid =0;
        while(s<=e){
            mid = s+ (e-s)/2;
            if(nums[mid] == target){
                range[0]=mid;
                e=mid-1;
            }
            else if (nums[mid]>target){
                e=mid-1;
            }
            else {
                s=mid+1;
            }

        }
        s=0;
        e=nums.length -1;
        while(s<=e){
            mid = s+ (e-s)/2;
            if(nums[mid] == target){
                range[1]=mid;
                s=mid+1;
            }
            else if (nums[mid]>target){
                e=mid-1;
            }
            else {
                s=mid+1;
            }

        }
        return range;
    }
}