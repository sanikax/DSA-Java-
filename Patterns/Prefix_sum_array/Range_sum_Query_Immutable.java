class NumArray {

    int[] psa;

    public NumArray(int[] nums) {
        psa = new int[nums.length];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            psa[i] = sum;
        }    
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return psa[right];
        }
        return psa[right] - psa[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */