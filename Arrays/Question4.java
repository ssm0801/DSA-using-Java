package Arrays;

import java.util.Arrays;

public class Question4 {

  // SC : O(1)
  // TC : O(n)
  public static void rightRotateByOne(int[] arr) {
    int n = arr.length;
    int temp = arr[n - 1];
    for (int i = n - 1; i >= 1; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = temp;
  }

  // SC : O(1)
  // TC : O(n)
  public static void leftRotateByOne(int[] arr) {
    int temp = arr[0];
    int n = arr.length;
    for (int i = 0; i <= n - 2; i++) {
      arr[i] = arr[i + 1];
    }
    arr[n - 1] = temp;
  }

  // bruteforce
  // SC : O(1)
  // TC : O(n^2)
  public static void rightRotateByX(int[] arr, int x) {
    int n = arr.length;
    x = x % n;
    for (int i = 0; i < x; i++) {
      rightRotateByOne(arr);
    }
  }

  // bruteforce
  // SC : O(1)
  // TC : O(n^2)
  public static void leftRotateByX(int[] arr, int x) {
    int n = arr.length;
    x = x % n;
    for (int i = 0; i < x; i++) {
      leftRotateByOne(arr);
    }
  }

  // better
  // same approach as rotate by one
  // SC : O(x)
  // TC : O(n+x)
  public static void rightRotateByXBetter(int[] arr, int x) {
    int n = arr.length;
    x = x % n;
    int temp[] = new int[x];
    // store last x elements in temp
    for (int i = n - x; i < n; i++) {
      temp[i - (n - x)] = arr[i];
    }
    // shift elements
    for (int i = n - 1; i >= x; i--) {
      arr[i] = arr[i - x];
    }
    // restore temp at beginning of arr
    for (int i = 0; i < temp.length; i++) {
      arr[i] = temp[i];
    }
  }

  // better
  // same approach as rotate by one
  // SC : O(x)
  // TC : O(n+x)
  public static void leftRotateByXBetter(int[] arr, int x) {
    int n = arr.length;
    x = x % n;
    int temp[] = new int[x];
    // store first x elements in temp
    for (int i = 0; i < x; i++) {
      temp[i] = arr[i];
    }
    // shift elements
    for (int i = 0; i <= n - x - 1; i++) {
      arr[i] = arr[i + x];
    }
    // restore temp at end of arr
    for (int i = n - x; i < n; i++) {
      arr[i] = temp[i - (n - x)];
    }
  }

  public static void reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int t = arr[start];
      arr[start] = arr[end];
      arr[end] = t;
      start++;
      end--;
    }
  }

  // optimised
  // based on observation
  // SC : O(1)
  // TC : O(n)
  public static void rightRotateByXOptimised(int[] arr, int x) {
    // 0 to n-x-1 & n-x to n-1
    // 0 to n-1
    int n = arr.length;
    x = x % n;
    reverse(arr, 0, n - x - 1);
    reverse(arr, n - x, n - 1);
    reverse(arr, 0, n - 1);
  }

  // optimised
  // based on observation
  // SC : O(1)
  // TC : O(n)
  public static void leftRotateByXOptimised(int[] arr, int x) {
    // 0 to x-1 & x to n-1
    // 0 to n-1
    int n = arr.length;
    x = x % n;
    reverse(arr, 0, x - 1);
    reverse(arr, x, n - 1);
    reverse(arr, 0, n - 1);
  }

  public static void main(String[] args) {
    int[] arr = { 13, 46, 24, 52, 20, 9, 75, 26, 7, 8, 32 };
    rightRotateByXOptimised(arr, 15);
    System.out.println("Left Rotated by one = " + Arrays.toString(arr));
  }
}
