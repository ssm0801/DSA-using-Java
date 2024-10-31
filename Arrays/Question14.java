package Arrays;

import java.util.Arrays;

public class Question14 {

  static void swap(int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  // bruteforce
  // SC : O(1)
  // TC : O(n)
  static void sort(int[] arr) {
    int zeroes = 0;
    int ones = 0;
    int twos = 0;
    for (int i : arr) {
      if (i == 0) {
        zeroes++;
      } else if (i == 1) {
        ones++;
      } else if (i == 2) {
        twos++;
      }
    }
    int index = 0;
    while (zeroes != 0) {
      arr[index++] = 0;
      zeroes--;
    }
    while (ones != 0) {
      arr[index++] = 1;
      ones--;
    }
    while (twos != 0) {
      arr[index++] = 2;
      twos--;
    }
  }

  // optimised
  // dutch national flag algorithm
  // three rules
  // [0 ... low-1] = 0's
  // [low ... mid-1] = 1's
  // [high+1 ... n-1] = 2's
  // SC : O(1)
  // TC : O(n)
  static void sortOptimised(int[] arr) {
    int n = arr.length;
    int low = 0;
    int mid = 0;
    int high = n - 1;
    while (mid < high) {
      if (arr[mid] == 0) {
        swap(arr, mid, low);
        mid++;
        low++;
      } else if (arr[mid] == 1) {
        mid++;
      } else if (arr[mid] == 2) {
        swap(arr, mid, high);
        high--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 0, 2, 1, 1, 0 };
    sortOptimised(arr);
    System.out.println("Sorted = " + Arrays.toString(arr));
  }
}
