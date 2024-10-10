package Sorting.Bubble;

import java.util.Arrays;

public class BubbleSort {

  // push maximum to last by swapping adjacents

  // O(n^2)
  // thinking from start to end [calculate inner loop limit similiar to pattern]
  static int[] bubbleSort1(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
    return arr;
  }

  // O(n^2)
  // thinking from end to start
  static int[] bubbleSort2(int[] arr) {
    int n = arr.length;
    for (int i = n - 1; i >= 1; i--) {
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
    return arr;
  }

  // optimised for best case
  // Worst & Avg = O(n^2)
  // Best = O(n)
  static int[] bubbleSortOptimised(int[] arr) {
    int n = arr.length;
    boolean isSwapped = false;
    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
          // if array is already sorted then no swap will happen in first iteration itself
          isSwapped = true;
        }
      }
      if (!isSwapped) {
        return arr;
      }
    }
    return arr;
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    int[] arrSorted = bubbleSort2(arr);
    System.out.println(Arrays.toString(arrSorted));
  }
}
