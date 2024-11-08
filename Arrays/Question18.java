package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question18 {

  // positive == negative
  // bruteforce
  // SC : O(n)
  // TC : O(2n)
  static void rearrage(int[] arr) {
    int n = arr.length;
    int i = 0;
    int j = 0;
    int pos[] = new int[n / 2];
    int neg[] = new int[n / 2];
    for (int k : arr) {
      if (k > 0) {
        pos[i++] = k;
      } else {
        neg[j++] = k;
      }
    }
    for (int k = 0; k < n / 2; k++) {
      arr[2 * k] = pos[k];
      arr[2 * k + 1] = neg[k];
    }
  }

  // positive == negative
  // optimised
  // SC : O(n)
  // TC : O(n)
  static void rearrageOptimised(int[] arr) {
    int n = arr.length;
    int temp[] = new int[n];
    int i = 0;
    int j = 1;
    for (int k = 0; k < n; k++) {
      if (arr[k] > 0) {
        temp[i] = arr[k];
        i += 2;
      } else {
        temp[j] = arr[k];
        j += 2;
      }
    }
    for (int k = 0; k < n; k++) {
      arr[k] = temp[k];
    }
  }

  // positive != negative
  // SC : O(n)
  // TC : O(n + n/2)
  static void rearrageVariant2(int[] arr) {
    List<Integer> pos = new ArrayList<>();
    List<Integer> neg = new ArrayList<>();
    for (int k : arr) {
      if (k > 0) {
        pos.add(k);
      } else {
        neg.add(k);
      }
    }
    int min = pos.size() > neg.size() ? neg.size() : pos.size();
    int k = 0;
    while (k < min) {
      arr[2 * k] = pos.get(k);
      arr[2 * k + 1] = neg.get(k);
      k++;
    }
    if (pos.size() > neg.size()) {
      k = neg.size() * 2;
      for (int x = neg.size(); x < pos.size(); x++) {
        arr[k++] = pos.get(x);
      }
    } else {
      k = pos.size() * 2;
      for (int x = pos.size(); x < neg.size(); x++) {
        arr[k++] = neg.get(x);
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 3, 1, -2, -5, 2, -4, -5, 6 };
    rearrageOptimised(arr);
    // int arr[] = { 3, 1, -2, -5, 2, -4, -5, -6 };
    // rearrageVariant2(arr);
    System.out.println("Rearranged = " + Arrays.toString(arr));
  }
}
