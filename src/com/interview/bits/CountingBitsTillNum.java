package com.interview.bits;

/**
 *
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBitsTillNum {
    public int[] countBits(int num) {
        if (num == 0) {
            return new int[1];
        }
        int[] count = new int[num + 1];
        count[0] = 0;
        int n = 1;
        int start = n;
        while (start <= num) {
            start = n;
            count[start++] = 1;
            int end = n<<1;
            while (start < end && start <= num) {
                count[start] = 1 + count[start - n];
                start++;
            }
            n = n<<1;
        }
        return count;
    }
}
