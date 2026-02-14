class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1 ){
            return nums.length;
        }
        int first = 1;
        int count = 0;

        for(int i = 1; i < nums.length ;i++ ){
            if(nums[count] != nums[i]){
                nums[++count]= nums[i];
            }
        }
        return count+1;
    }
}