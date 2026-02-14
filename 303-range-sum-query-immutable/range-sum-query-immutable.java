class NumArray {
    int [] prefix;
    public NumArray(int[] nums) {
        prefix = new int [nums.length];
        int sum = 0;
        for(int i = 0 ; i< nums.length ;  i++){
            sum+=nums[i];
            prefix[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        int ans = 0;
        if(left !=0){
            ans -= prefix[left-1];
        }
        ans+= prefix[right];
        return ans;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */