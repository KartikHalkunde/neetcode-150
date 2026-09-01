class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int sum = 0;
        int min = nums.length + 1;

        while (high < nums.length) {
            sum += nums[high];

            while (sum >= target) {
                min = Math.min(min, high - low + 1);
                sum -= nums[low];
                low++;
            }

            high++;
        }

        return min == nums.length + 1 ? 0 : min;
    }
}
