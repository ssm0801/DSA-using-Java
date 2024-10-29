package Arrays;

import java.util.HashMap;

public class Question11 {

  // find number which is appearing once
  // bruteforce
  // SC : O(1)
  // TC : O(n^2)
  static int singleNum(int[] arr) {
    int count = 0;
    for (int i : arr) {
      for (int j : arr) {
        if (i == j) {
          count++;
        }
      }
      if (count == 1) {
        return i;
      }
      count = 0;
    }
    return -1;
  }

  // better
  // SC : O(n)
  // TC : O(n)
  static int singleNumBetter(int[] arr) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i : arr) {
      hm.put(i, hm.getOrDefault(i, 0) + 1);
    }
    for (int i : hm.keySet()) {
      if (hm.get(i) == 1) {
        return i;
      }
    }
    return -1;
  }

  // optimised
  // SC : O(1)
  // TC : O(n)
  static int singleNumOptimised(int[] arr) {
    int xor = 0;
    for (int i : arr) {
      xor = xor ^ i;
    }
    return xor;
  }

  public static void main(String[] args) {
    int arr[] = { 4, 2, 1, 1, 2 };
    int num = singleNumOptimised(arr);
    System.out.println("single number = " + num);
  }
}
