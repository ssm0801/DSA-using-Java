package Arrays;

import java.util.HashMap;

public class Question15 {

  // bruteforce
  // SC : O(1)
  // TC : O(n^2)
  static int majorityElement(int[] arr) {
    int n = arr.length;
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if (arr[j] == arr[i]) {
          count++;
        }
      }
      if (count > n / 2) {
        return arr[i];
      }
      count = 0;
    }
    return -1;
  }

  // better
  // SC : O(n)
  // TC : O(n * log n)
  static int majorityElementBetter(int[] arr) {
    int n = arr.length;
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i : arr) {
      hm.put(i, hm.getOrDefault(i, 0) + 1);
    }
    for (int i : hm.keySet()) {
      if (hm.get(i) > n / 2) {
        return i;
      }
    }
    return -1;
  }

  // optimised
  // moore's voting algorithm
  // count of the majority element is always greater than 0 after cancelling out
  // SC : O(1)
  // TC : O(n)
  static int majorityElementOptimised(int[] arr) {
    int res = 0;
    int count = 0;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (count == 0) {
        res = arr[i];
      }
      if (arr[i] == res) {
        count++;
      } else {
        count--;
      }
    }
    // res element may or may not be majority element
    // so verify using below loop
    int count_res = 0;
    for (int i : arr) {
      if (i == res) {
        count_res++;
      }
    }
    return count_res > n / 2 ? res : -1;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
    int res = majorityElementOptimised(arr);
    System.out.println("Majority element = " + res);
  }
}
