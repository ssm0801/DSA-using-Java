package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question20 {

  // SC : O(n)
  // TC : O(n^2)
  static int[] leaders(int[] arr) {
    int n = arr.length;
    List<Integer> temp = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      boolean leader = true;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] > arr[i]) {
          leader = false;
          break;
        }
      }
      if (leader) {
        temp.add(arr[i]);
      }
    }
    return temp.stream().mapToInt(Integer::intValue).toArray();
  }

  // SC : O(n)
  // TC : O(n)
  static int[] leadersOptimised(int[] arr) {
    int n = arr.length;
    List<Integer> temp = new ArrayList<>();
    int currMax = Integer.MIN_VALUE;
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] >= currMax) {
        currMax = arr[i];
        temp.add(0, arr[i]);
      }
    }
    return temp.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    int arr[] = { 16, 17, 4, 3, 12, 10, 5, 2 };
    int temp[] = leadersOptimised(arr);
    System.out.println("Leaders = " + Arrays.toString(temp));
  }
}
