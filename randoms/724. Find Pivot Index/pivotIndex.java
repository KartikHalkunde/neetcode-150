class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int sum = 0;
        int n = nums.length;

        for(int num : nums){
            sum += num;
        }

        for(int i = 0; i < n ; i++){
            int right = sum  - left - nums[i];

             if(left == right){
                return i;
            }
            
            left +=  nums[i];
        }
        return -1;
    }
}
