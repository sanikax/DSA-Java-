class Solution {
    public int subarraySum(int[] nums) {
        int sum = 0;
        int[] psa = new int[nums.length];
        
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            psa[i] = sum;
        }
        int result = 0;

        for(int i = 0; i<nums.length; i++){
            int start = Math.max(0, i - nums[i]);
            if(start == 0){
                result += psa[i];
            }else{
            result = result + (psa[i] - psa[start-1]);
            }
        }
        return result;
    }
}