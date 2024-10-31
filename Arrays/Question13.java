package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import Sorting.Quick.QuickSort;

public class Question13 {

  // indicies of two numbers that add up to
  // bruteforce
  // SC : O(1)
  // TC : O(n^2)
  static int[] twoSum(int[] arr, int target) {
    int indices[] = new int[2];
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == target) {
          indices[0] = i;
          indices[1] = j;
          return indices;
        }
      }
    }
    return indices;
  }

  // optimal for returning indices
  // SC : O(n)
  // TC : O(n * log n)
  static int[] twoSumOptimised1(int[] arr, int target) {
    int indices[] = new int[2];
    HashMap<Integer, Integer> hm = new HashMap<>();
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int first = arr[i];
      int second = target - arr[i];
      if (hm.containsKey(second)) {
        indices[0] = i;
        indices[1] = hm.get(second);
        return indices;
      }
      hm.put(first, i);
    }
    return indices;
  }

  // optimal for returning true/false
  // SC : O(1)
  // TC : O(n * log n)
  static boolean twoSumOptimised2(int[] arr, int target) {
    int n = arr.length;
    // O(n * log n)
    QuickSort.quickSort(arr, 0, n - 1);
    int i = 0;
    int j = n - 1;
    while (i < j) {
      int sum = arr[i] + arr[j];
      if (sum < target) {
        i++;
      } else if (sum == target) {
        return true;
      } else {
        j--;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 7, 11, 15 };
    int target = 9;
    int res[] = twoSumOptimised1(arr, target);
    System.out.println("Indcies = " + Arrays.toString(res));
  }
}
