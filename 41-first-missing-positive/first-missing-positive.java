class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;

        while(i <nums.length ){
            int correct = nums[i] -1;
            if(nums[i]>0 && correct < nums.length && nums[i] != nums[correct]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }

        for (i = 0; i<nums.length; i++){
            if(nums [i] != i+1){
                return i+1;
            }
        }
        return nums.length +1;
    }
}