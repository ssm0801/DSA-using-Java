package Sorting.Quick;

import java.util.Arrays;

public class QuickSort {

  // consider pivot as first index element
  // take a pivot and place it at its correct position
  // by placing smaller values than pivot on left and bigger values on right
  // O(n * log n)
  public static void quickSort(int[] arr, int low, int high) {
    if (low >= high)
      return;
    int pIndex = partition(arr, low, high);
    quickSort(arr, low, pIndex - 1);
    quickSort(arr, pIndex + 1, high);
  }

  static int partition(int[] arr, int low, int high) {
    int pivot = low;
    int left = low;
    int right = high;
    while (left < right) {
      while (arr[left] <= arr[pivot] && left < high) {
        left++;
      }
      while (arr[right] > arr[pivot] && right > low) {
        right--;
      }
      if (left < right) {
        swap(arr, left, right);
      }
    }
    swap(arr, pivot, right);
    return right;
  }

  static void swap(int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  public static void main(String[] args) {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}
