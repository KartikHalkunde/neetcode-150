class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = k - 1;
        int n = nums.length;
        int sum = 0;
        double ans = 0.00000;


        while(high < n){
            if(low == 0){
                for(int i = low; i <= high; i++){
                    sum += nums[i];
                }                
                ans = (double)  sum / k;
                high++;
                low++;
            }
            else{
                sum = sum +  nums[high] - nums[low - 1];
                ans = Math.max(ans, (double) sum / k);
                high++;
                low++;
            }
        }
        return ans;
    }
}
