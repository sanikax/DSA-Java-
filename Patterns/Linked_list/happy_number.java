class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();
        visited.add(n);
        while(true){
            int sum = 0;
            while(n > 0){
                int i = n % 10;
                sum += i*i;
                n = n / 10;      
            }
            n = sum;
            if(sum == 1){
                return true;
            }else if(visited.contains(sum)){
                return false;
            }
            visited.add(sum);
        }
    }
}