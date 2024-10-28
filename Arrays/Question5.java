package Arrays;

import java.util.Arrays;

public class Question5 {

  // bruteforce
  // SC : O(n)
  // TC : O(n)
  static void moveZerosToEnd(int[] arr) {
    int n = arr.length;
    int temp[] = new int[n];
    int current = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] != 0) {
        temp[current++] = arr[i];
      }
    }
    for (int i = 0; i < current; i++) {
      arr[i] = temp[i];
    }
    for (int i = current; i < n; i++) {
      arr[i] = 0;
    }
  }

  static void swap(int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  // optimised
  // SC : O(1)
  // TC : O(n)
  static void moveZerosToEndOptimised(int[] arr) {
    int n = arr.length;
    int i = 0;
    int j = 0;
    while (j < n) {
      if (arr[j] != 0) {
        swap(arr, i, j);
        i++;
      }
      j++;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 0, 1, 0, 3, 12 };
    moveZerosToEndOptimised(arr);
    System.out.println(Arrays.toString(arr));
  }
}
