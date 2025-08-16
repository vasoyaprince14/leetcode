class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        List<Integer> awns = new ArrayList<>();

        while( i < nums.length){
            // if(nums[i] != i+1){
                int correct = nums[i]-1;
                if(nums[i] != nums[correct]){
                    int temp = nums[correct];
                    nums[correct] = nums[i];
                    nums[i] = temp;
                }
                else{
                    // awns.add(nums[i]);
                    i++;
                }
            }
            // else{
            //     i++;
            // }
        

    for(i=0;i<nums.length;i++){
        if(nums[i]!= i+1){
            awns.add(nums[i]);
        }
    }

    return awns;

}
}