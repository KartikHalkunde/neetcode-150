class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int n = nums.length;

        for(int i = 0; i < n -1 ;i++){
            if(nums[i+1] != nums[i]){
                nums[left + 1] = nums[i+1];
                left++;
            }
        }
         return left+1;
    }
}
