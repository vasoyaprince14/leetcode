class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i : nums){
             min = Math.min(min,i);
             max = Math.max(max,i); 
        } 
        int  i = 1;
        int awns = i;
        while(i<=min){
            if (min%i==0 && max % i ==0){
                awns = i;
            }
            i++;
        }

        return awns;
    }
}