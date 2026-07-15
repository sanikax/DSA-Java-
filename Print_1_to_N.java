// Print numbers from 1 to N without using the '+' operator 

import java.unil.*;

public class Print1toN (
    static void print(int i, int n){

        if(n < i){
            return;
        }

        print(i, n-1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");

        int n = sc.nextInt();

        print(1, n);

        sc.close();
    }
)