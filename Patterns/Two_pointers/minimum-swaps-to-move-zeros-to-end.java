class Solution {
    public int minimumSwaps(int[] nums) {
        int right = nums.length - 1;
        int count = 0;
        int left = 0;
        while(left <= right){
            if(nums[right] == 0){
                right--;
            }else if(nums[left] == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                count++;
                right--;
            }
            if(nums[left] != 0){
                left++;
            }
        }
        return count;
    }
}