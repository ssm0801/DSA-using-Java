package Arrays;

import java.util.HashMap;

public class Question12 {

  // longest sub array with sum K
  // bruteforce
  // SC : O(1)
  // TC : O(n^2)
  static int longestSubArray(int[] arr, int k) {
    int longest = 0;
    int currentLength = 0;
    int sum = 0;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        sum += arr[j];
        if (sum == k) {
          currentLength = j - i + 1;
          longest = Math.max(longest, currentLength);
        }
      }
      sum = 0;
    }
    return longest;
  }

  // better
  // SC : O(n)
  // TC : O(n * log n)
  static int longestSubArrayBetter(int[] arr, int k) {
    // (preSum, index)
    HashMap<Integer, Integer> preSumMap = new HashMap<>();
    int longest = 0;
    int sum = 0;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (sum == k) {
        longest = Math.max(longest, i + 1);
      }
      int rem = sum - k;
      if (preSumMap.containsKey(rem)) {
        int len = i - preSumMap.get(rem);
        longest = Math.max(longest, len);
      }
      if (!preSumMap.containsKey(sum)) {
        preSumMap.put(sum, i);
      }
    }
    return longest;
  }

  // optimised
  // only for positive integers - two pointers
  // SC : O(1)
  // TC : O(2n)
  static int longestSubArrayOptimised(int[] arr, int k) {
    int i = 0;
    int j = 0;
    int longest = 0;
    int n = arr.length;
    int sum = arr[0];
    while (i < n) {
      // this loop is running overall only for n
      while (sum > k && j <= i) {
        sum -= arr[j];
        j++;
      }
      if (sum == k) {
        longest = Math.max(longest, i - j + 1);
      }
      i++;
      if (i < n) {
        sum += arr[i];
      }
    }
    return longest;
  }

  public static void main(String[] args) {
    int arr[] = { 10, 5, 2, 7, 1, 9 };
    int k = 15;
    int longest = longestSubArrayOptimised(arr, k);
    System.out.println("Longest sub array = " + longest);
  }
}
