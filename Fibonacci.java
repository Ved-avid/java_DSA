package java_DSA;
import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    static int[] dp;
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int size = sc.nextInt();
        dp = new int[size+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        int result = fib(size);
        System.out.println("Result - > "+result);
    }

    public static int fib(int n){
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = fib(n-1)+fib(n-2);
    }


}
