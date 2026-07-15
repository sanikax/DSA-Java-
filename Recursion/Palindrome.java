// check if the given string is a Palindrome

import java.util.*;

public class Palindrome {

    public static boolean Palindrome(char[] arr, int i, int n){

        if(i >= n/2){
            return true;
        }
        
        if(arr[i] != arr[n-i-1]){
            return false;
        }

        return Palindrome(arr, i+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = sc.next();

        char[] arr = str.toCharArray();

        int n = str.length(); 
        
        System.out.print("Is Palindrome: " + Palindrome(arr, 0, n));
        
        sc.close();

    }
}