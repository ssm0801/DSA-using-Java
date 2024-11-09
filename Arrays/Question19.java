package Arrays;

import java.util.Arrays;
import Sorting.Quick.QuickSort;

public class Question19 {

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void reverse(int[] arr, int start, int end) {
    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }

  static int[] nextPermutation(int[] arr) {
    int n = arr.length;
    int temp[] = new int[n];

    // generate all permutations using recursion - Array size n!
    // linear search for arr in all permutations array
    // get next permutation

    return temp;
  }

  // SC : O(1)
  // TC : O(n)
  static void nextPermutationOptimised(int[] arr) {
    int n = arr.length;
    int breakpoint = -1;
    // longer prefix match = find breakpoint where i < i+1
    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] < arr[i + 1]) {
        breakpoint = i;
        break;
      }
    }
    if (breakpoint == -1) {
      // sort or reverse
      // Arrays.sort(arr, 0, n);
      reverse(arr, 0, n - 1);
    } else {
      // find immediate max from breakpoint+1 to n-1 to replace with breakpoint
      for (int i = n - 1; i > breakpoint; i--) {
        if (arr[i] > arr[breakpoint]) {
          swap(arr, breakpoint, i);
          break;
        }
      }
      // as 0 to breakpoint is immediate maximised, so to make array immediate next
      // permutation we have to minimise the breakpoint+1 to n-1

      // sort or reverse
      // Arrays.sort(arr, breakpoint + 1, n);
      reverse(arr, breakpoint + 1, n - 1);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 3, 2, 1 };
    // int temp[] = nextPermutation(arr);
    nextPermutationOptimised(arr);
    System.out.println("Next permutation = " + Arrays.toString(arr));
  }
}
