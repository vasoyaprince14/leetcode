class Solution {
    public int majorityElement(int[] nums) {
        int el = -1;
        int len = 0;

        for(int i = 0; i< nums.length;i++){
          if (len == 0){
            el = nums[i];
          }
          if(nums[i]==el){
            len ++;
          }
          else{
            len --;
          }
        }
        return el;
    }
}