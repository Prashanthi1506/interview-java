package com.interview.dynamicprogramming;

/**
 * Fibonacci series
 */
public class FibonacciSeries {

	 /**
     * DP version where we do not recalculate values but just keep last 2
     * calculate values
     */
    public int fibonacciSeries(int n){
        int n1 = 0, n2 = 1;
        int sum;

        if (n == n1 || n == n2) {
            return n;
        }

        for(int i=2; i <= n; i++){
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return n2;
    }
    
   
    /**
     * Recursive and slow version. Recalculates same value over and over again.
     * Chokes for n greater than 60
     */
    public int fibonacciSeriesRecursive(int n){
        if(n == 1 || n == 0){
            return n;
        }
        return fibonacciSeriesRecursive(n-1) + fibonacciSeriesRecursive(n-2);
    }
    
    public static void main(String args[]){
        FibonacciSeries fs = new FibonacciSeries();
        System.out.println(fs.fibonacciSeries(15));
        System.out.println(fs.fibonacciSeriesRecursive(15));
    }
    
}
