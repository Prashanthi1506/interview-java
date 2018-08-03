package com.interview.stackqueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * http://www.geeksforgeeks.org/the-stock-span-problem/

 */
public class StockSpanProblem {
    public static int[] stockSpan(int[] prices){
        Deque<Integer> stack = new ArrayDeque<>();
        int[] stockSpan = new int[prices.length];
        stockSpan[0] = 1;
        stack.offerFirst(0);
        for (int i = 1; i < prices.length ; i++) {
            while (!stack.isEmpty() && prices[stack.peekFirst()] < prices[i]) {
                stack.pollFirst();
            }
            if (stack.isEmpty()) {
                stockSpan[i] = i + 1;
            } else {
                stockSpan[i] = i - stack.peekFirst();
            }
            stack.offerFirst(i);
        }
        return stockSpan;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = stockSpan(prices);
        System.out.print(Arrays.toString(result));
    }
}
