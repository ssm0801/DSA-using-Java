package Sorting.Insertion;

import java.util.Arrays;

public class InsertionSort {

  // take an element and place it in its correct position on its left part

  // Worst & Avg = O(n^2)
  // Best = O(n)
  static int[] insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i <= n - 1; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        swap(arr, j - 1, j);
        j--;
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
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
