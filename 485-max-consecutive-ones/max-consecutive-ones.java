class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int num = 0;
        int currSum = 0 ;
        for (int i :nums){
            if(i==1){
                currSum += 1;
                num = Math.max(currSum,num);
            }
            else{
                currSum = 0 ;
            }
        }
        return num;
        
    }
}