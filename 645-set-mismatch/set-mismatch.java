class Solution {
    public int[] findErrorNums(int[] nums) {
        // Step 1: Place numbers at their correct index using cyclic sort
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1; // correct index for nums[i]
            
            // If nums[i] is not at the correct index, swap it
            if (nums[i] != nums[correct]) {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                // If it's already in the right place, move forward
                i++;
            }
        }

        // Step 2: After sorting, find the mismatch
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                // nums[i] → duplicate number
                // i+1   → missing number
                return new int[]{nums[i], i + 1};
            }
        }

        // This should never be reached for valid input
        return new int[]{-1, -1};
    }
}
