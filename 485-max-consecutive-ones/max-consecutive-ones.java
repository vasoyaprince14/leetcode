class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNum = 0;
        int currNum = 0 ;

        for(int i : nums){
            if(i == 1){
                currNum++;
            }
            else{
                maxNum = Math.max(maxNum, currNum);
                currNum = 0;
            }
        }    
        maxNum = Math.max(maxNum, currNum); 
        return maxNum;
    }

}