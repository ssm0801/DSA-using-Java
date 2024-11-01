package Arrays;

public class Question16 {

  // subarray such that its sum is maximum among all subarrays
  // bruteforce
  // SC : O(1)
  // TC : O(n^2)
  static int largestSumSubArray(int[] arr) {
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        sum += arr[j];
        maxSum = Math.max(maxSum, sum);
      }
      sum = 0;
    }
    return maxSum;
  }

  // optimised
  // kadane's algorithm
  // SC : O(1)
  // TC : O(n)
  // follow up question will be to print any one such subarray
  static int largestSumSubArrayOptimised(int[] arr) {
    int n = arr.length;
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;
    int ansStart = -1;
    int ansEnd = -1;
    int start = 0;
    for (int i = 0; i < n; i++) {
      // when every new subarray starts sum will be 0
      if (sum == 0) {
        start = i;
      }
      sum += arr[i];
      if (sum > maxSum) {
        maxSum = sum;
        ansStart = start;
        ansEnd = i;
      }
      // if sum < 0 - discard the sum calculated
      if (sum < 0) {
        sum = 0;
        start = -1;
      }
    }
    // sub array
    for (int i = ansStart; i <= ansEnd; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    return maxSum;
  }

  public static void main(String[] args) {
    int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int res = largestSumSubArrayOptimised(arr);
    System.out.println("Largest sum sub array = " + res);
  }
}
