class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        int max = 0;
    
        for (int num : nums) {
            max = Math.max(max, num);
        }
    
        int[] freq = new int[max + 1];
    
        for (int num : nums) {
            freq[num]++;
        }
    
        int index = 0;
    
        for (int i = 0; i <= max; i++) {
            while (freq[i] > 0) {
                nums[index++] = i;
                freq[i]--;
            }
        }

        long result = 0;
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            int val = nums[n - 1 - i];

            long useMul = (long) val * (mul - i);
            long useNormal = val;

            result += Math.max(useMul, useNormal);
        }
        return result;
    }
}