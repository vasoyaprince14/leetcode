class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            int digit= numOfDigit(num);
            if(digit % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public int numOfDigit(int num){
        int count = 0;
        while(num!=0){
            num = num/10;
            count++;
        }
        return count;
    }
}