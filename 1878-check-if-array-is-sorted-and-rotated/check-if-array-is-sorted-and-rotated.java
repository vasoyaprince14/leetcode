class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        if(nums.length==0 || nums.length == 1){
            return true;
        }
        for( int i=1; i< nums.length; i++){
            if(nums[i-1]>nums[i]){
                if(count>0){
                    return false; 
                }
                count ++;
            }
        }
        if(count == 1 && nums[nums.length-1]> nums[0]){
            return false;
        }
        return true;
    }
}