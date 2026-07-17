// print the fibbonacci number 

import java.util.*;

public class Fibbonacci{
    public static int fibbonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibbonacci(n-1) + fibbonacci(n-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the fibbonnaci range: ");
        int n = sc.nextInt();
        
        System.out.print(fibbonacci(n));
        
        sc.close();
    }
}