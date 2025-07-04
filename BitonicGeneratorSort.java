/*
  Bitonic Generator Sort

Given an array arr the task is to sort all even-placed numbers in increasing 
and odd-place numbers in decreasing order. The modified array should contain 
all sorted even-placed numbers followed by reverse sorted odd-placed numbers.
Note: that the first element is considered as even because of its index 0.

Examples:

Input: arr[] = [0, 1, 2, 3, 4, 5, 6, 7]
Output: [0, 2, 4, 6, 7, 5, 3, 1]
Explanation: Even-place elements : 0, 2, 4, 6 Odd-place elements : 1, 3, 5, 7 
Even-place elements in increasing order : 0, 2, 4, 6 Odd-Place elements in decreasing order : 7, 5, 3, 1
Input: arr[] = [3, 1, 2, 4, 5, 9, 13, 14, 12]
Output: [2, 3, 5, 12, 13, 14, 9, 4, 1]
Explanation: Even-place elements : 3, 2, 5, 13, 12 Odd-place elements : 1, 4, 9, 14 
Even-place elements in increasing order : 2, 3, 5, 12, 13 Odd-Place elements in decreasing order : 14, 9, 4, 1
 */

import java.util.*;
class Solution {
    public static ArrayList<Integer> bitonicGenerator(int arr[]) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());

        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(even);
        result.addAll(odd);

        return result;
    }
}