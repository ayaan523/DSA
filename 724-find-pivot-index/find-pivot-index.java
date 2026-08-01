class Solution {

    public int pivotIndex(int[] nums) {

        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int totalSum = prefix[nums.length - 1];

        for (int i = 0; i < nums.length; i++) {

            int leftSum = prefix[i] - nums[i];
            int rightSum = totalSum - prefix[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}