class Solution {
    public void nextPermutation(int[] nums) {
        int right = nums.length - 1;
        for(int i = nums.length - 1; i>=0; i--){
            if(i == 0){
                Arrays.sort(nums);
                return;
            }else if(nums[i] > nums[i - 1]){
                int pivot = i - 1;
                for(int j = right; j>pivot; j--){
                    if(nums[j] > nums[pivot]){
                        int temp = nums[pivot];
                        nums[pivot] = nums[j];
                        nums[j] = temp;
                        Arrays.sort(nums, i, right+1);
                        return;
                    }
                }
            }
        }   
    }
}