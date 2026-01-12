class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        // Check all possible pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // As per problem statement, one valid answer always exists
        return new int[]{};
    }
}
