class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int awns = 0;
        int count = 0;

        for (int i : nums){
            if(i == 0){
                awns = Math.max(awns, count);
                count = 0;
            }
            else{
                count ++;
            }
        }

        return Math.max(awns , count);
        
    }
}