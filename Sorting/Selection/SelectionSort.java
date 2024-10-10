package Sorting.Selection;

import java.util.Arrays;

public class SelectionSort {

  // select minimum and swap
  // O(n^2)
  static int[] selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i <= n - 2; i++) {
      int min = i;
      for (int j = i; j <= n - 1; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      swap(arr, i, min);
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
    int[] arrSorted = selectionSort(arr);
    System.out.println(Arrays.toString(arrSorted));
  }
}
