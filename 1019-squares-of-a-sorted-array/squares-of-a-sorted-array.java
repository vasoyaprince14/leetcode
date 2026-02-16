class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[] = new int [nums.length];
        int index = nums.length - 1;
        int i = 0;
        int j = nums.length -1;
        while(i<=j){
            if(nums[i]*nums[i]> nums[j]*nums[j]){
                arr[index--]=nums[i]*nums[i];
                i++;
            }
            else{
                arr[index--]=nums[j]*nums[j];
                j--;
            }
        }
        return arr;
    }
}