class Solution {
    public int missingNumber(int[] nums) {
        
        int i = 0;

        while(i < nums.length){
            int correct = nums[i] - 1;
            if(correct >= 0 && nums[correct] != nums[i]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0 ; j<nums.length ; j++){
            if(nums[j] == 0){
                return j+1;
            }
        }
        return 0;
    }
}