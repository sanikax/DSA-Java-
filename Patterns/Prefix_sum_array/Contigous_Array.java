class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefix = 0;
        int maxlen = 0;

        map.put(0, -1);

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                prefix += -1;
            }else{
                prefix += 1;
            }

            if(map.containsKey(prefix)){
                int prevIndex = map.get(prefix);
                maxlen = Math.max(maxlen, i - prevIndex);
            }else{
                map.put(prefix, i);
            }
        }
        return maxlen;

    }
}