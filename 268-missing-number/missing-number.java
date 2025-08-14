class Solution {
    public int missingNumber(int[] nums) {

        int i =0;

        while(i<nums.length){
            int correct = nums[i];
            if(correct<nums.length && nums[i] != nums[correct]){
                int temp = nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }

        for( i =0 ;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return i;
    }
}