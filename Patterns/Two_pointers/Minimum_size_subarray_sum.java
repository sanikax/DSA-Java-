class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int min_sub = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while (sum >= target){
                min_sub = Math.min(min_sub, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        if(min_sub != Integer.MAX_VALUE){
            return min_sub;
        }

        return 0;
    }
}