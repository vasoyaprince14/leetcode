class Solution {
    public int search(int[] nums, int target) {
        return bin (nums,target,0,nums.length-1);
    }

    public int bin(int nums[], int target , int s, int e){
        if(e<s){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(nums[mid]== target){
            return mid;
        }
        if(nums[mid]>target){
           return bin(nums,target,s,mid-1);
        }
        else{
            return bin(nums,target,mid+1,e);
        }
    }
}