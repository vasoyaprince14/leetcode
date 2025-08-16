class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> result = new ArrayList<>();

        // Step 1: Place each number in its correct index using cyclic sort
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            // If current number is not at its correct index,
            // AND the correct index doesn't already have the same number
            if (nums[i] != nums[correctIndex]) {
                // Swap nums[i] to its correct position
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else {
                // If already in correct place OR duplicate detected, move forward
                i++;
            }
        }

        // Step 2: Find numbers that are not in their correct position
        // These are duplicates because their correct spot already had the same number
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}
