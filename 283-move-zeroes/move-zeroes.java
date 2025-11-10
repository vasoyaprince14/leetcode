class Solution {
    public void moveZeroes(int[] nums) {
        
        int arr [] = new int [nums.length];

        for(int i = 0, j =0; i<nums.length ; i++){
            if(nums[i]!= 0){
                arr[j++]=nums[i];
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            System.out.println(arr[i]+ ' '  + nums[i]);
            if(arr[i] != 0){
                nums[i] = arr[i];
            }
            else{
                nums[i] = 0;
            }
        }
    }
}