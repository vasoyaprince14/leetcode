class Solution {
    public int singleNumber(int[] nums) {
        int awns = 0;

        for(int i : nums){
            awns ^= i;
        }
        return awns;
        
    }
}