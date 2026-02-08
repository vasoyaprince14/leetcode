class Solution {
    public int[] rearrangeArray(int[] nums) {
        int awns []= new int [nums.length];
        int pos= 0;
        int neg = 1;

        for(int i = 0; i<nums.length;i++){
            if(nums[i]<0){
                awns[neg] = nums[i];
                neg +=2;
            }
            else{
                awns[pos] = nums[i];
                pos+=2;
            }
        }
        return awns;
        
    }
}