class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max_count = 0;
        for(int i = 0; i<s.length(); i++){

            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }

            max_count = Math.max(max_count, i - left + 1);
            map.put(s.charAt(i), i);
        }
        return max_count;   
    }
}