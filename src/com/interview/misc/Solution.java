package com.interview.Misc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findShortestSubArray(int[] arr) {
        Map<Integer, Integer> first = new HashMap<Integer, Integer>();     
        Map<Integer, Integer>  end = new HashMap<Integer, Integer>();
        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (first.get(element) == null) first.put(element, i);
            end.put(element, i);
            counter.put(element, counter.getOrDefault(element, 0) + 1);
        }

        int result = arr.length;
        int degree = Collections.max(counter.values());
        for (int element: counter.keySet()) {
            if (counter.get(element) == degree) {
            	result = Math.min(result, end.get(element) - first.get(element) + 1);
            }
        }
        return result;
    }
}
