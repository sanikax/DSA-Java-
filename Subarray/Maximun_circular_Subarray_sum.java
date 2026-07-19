import java.util.*;

public class Maximum_subarray{
    public static int maximum_sub(int[] nums){
        int total = nums[0];
        
        int currentX = nums[0], max = 0;
        int currentN = nums[0], min = 0;
        
        for(int i = 1; i< nums.length; i++){
            
            total += nums[i];
             
            currentX = Math.max(currentX, currentX + nums[i]);
            max = Math.max(max, currentX);
            
            currentN = Math.min(currentN, currentN + nums[i]);
            min = Math.min(min, currentN);
            
        }
        
        return (max < 0) ? max : Math.max(max, total - min);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        
        for(int i = 0; i < n; i++){
            System.out.print("Enter Element: ");
            nums[i] = sc.nextInt();
        }
        
        System.out.print("The Maximun Subarray Sum is: " + maximum_sub(nums));
        
        sc.close();
        
    }
    
}