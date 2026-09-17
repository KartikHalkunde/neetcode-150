class Solution {
    public int maxSubArray(int[] nums) {
        int prev = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length ; i++){
            int curr = nums[i];
            prev = Math.max(curr, curr + prev );
            result = Math.max(prev, result);
        }
        return result;
    }
}
