package Sorting.Merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

  // divide and merge
  // O(n * log n)
  static void mergeSort(int[] arr, int low, int high) {
    if (low >= high)
      return;
    int mid = (low + high) / 2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  static void merge(int[] arr, int low, int mid, int high) {
    int left = low;
    int right = mid + 1;
    List<Integer> temp = new ArrayList<>();
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }
    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }
    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }
    for (int i = low; i <= high; i++) {
      arr[i] = temp.removeFirst();
    }
  }

  // using array instead of array list for temp
  static void merge2(int arr[], int low, int mid, int high) {
    int left = low;
    int right = mid + 1;
    int[] temp = new int[high - low + 1];
    int index = 0;
    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp[index] = arr[left];
        index++;
        left++;
      } else {
        temp[index] = arr[right];
        index++;
        right++;
      }
    }
    while (left <= mid) {
      temp[index] = arr[left];
      left++;
      index++;
    }
    while (right <= high) {
      temp[index] = arr[right];
      right++;
      index++;
    }
    for (int i = 0; i < temp.length; i++) {
      arr[i + low] = temp[i];
    }
  }

  public static void main(String[] args) {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    mergeSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}
