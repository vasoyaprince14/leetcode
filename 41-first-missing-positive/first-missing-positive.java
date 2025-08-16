class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;

        // Step 1: Place each number in its correct index
        // e.g., 1 should be at index 0, 2 at index 1, etc.
        while (i < nums.length) {
            int correct = nums[i] - 1; // expected index for nums[i]

            // Swap only if:
            // 1. nums[i] is positive
            // 2. nums[i] is within array bounds (≤ nums.length)
            // 3. nums[i] is not already at the correct index
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                // Swap nums[i] with the value at its correct index
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                // If already in correct place or invalid number, move to next
                i++;
            }
        }

        // Step 2: Scan the sorted array
        // The first index i where nums[i] != i+1 is our answer
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all numbers from 1...n are present,
        // then the missing number is nums.length + 1
        return nums.length + 1;
    }
}
