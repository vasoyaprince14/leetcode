class Solution {
    public int maxSubArray(int[] nums) {
        int min = Integer.MIN_VALUE;
        int sum =0;

        for(int i :nums){
            sum+= i;
            if(min<sum){
                min = sum;
            }
            if( sum < 0){
                sum = 0;
            }

        }
        return min;
        
    }
}