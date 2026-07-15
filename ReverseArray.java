// Reverse the given array using recursion

import java.util.*;

public class ReverseArray {

    public static void Reverse(int[] arr, int i, int n){

        if(i >= n/2){
            return;
        }
        
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        Reverse(arr, i+1, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.print("Enter the Elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Reverse(arr, 0, n);
        
        System.out.print("The Reversed Array is: ");
        
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();

    }
}