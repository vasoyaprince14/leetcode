class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int [nums.length];
        int pre[]= new int [nums.length];
        int suf[]= new int [nums.length];
        int j = nums.length -1;
        for(int i =0;i<nums.length;i++){
            if(i==0){
                pre[i]=1;
                suf[j]=1;
                j--;
            }
            else{
            pre[i] = pre[i-1]*nums[i-1];
            suf[j] = suf[j+1]*nums[j+1];
            j--;
            }
        }
        for(int i = 0 ; i<nums.length;i++){
            arr[i]=pre[i]*suf[i];
        }
        return arr;
    }
}