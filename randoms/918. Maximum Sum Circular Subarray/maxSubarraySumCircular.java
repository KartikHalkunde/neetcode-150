class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        
        int max = nums[0];
        int min = nums[0];
        int maxres = nums[0];
        int minres = nums[0];
        int sum = nums[0];

        for(int i = 1; i < n; i++){
            int curr = nums[i];
            sum += curr;
            max = Math.max(curr, curr + max);
            maxres = Math.max(maxres, max);
            min = Math.min(curr, curr + min);
            minres = Math.min(minres, min);
        }

        if(maxres < 0){
            return maxres;
        }

        int circularMax = sum - minres;

        return  Math.max(maxres, circularMax);
    }
}
