package Hashing;

import java.util.Arrays;

public class Frequencies {
  public static void main(String[] args) {
    int n = 5;
    // arr has numbers from 1 to n
    int[] arr = { 2, 3, 2, 3, 5 };
    int[] ans = new int[n + 1];

    // O(n)
    for (int i = 0; i < n; i++) {
      if (arr[i] <= n) {
        ans[arr[i] - 1]++;
      }
    }
    System.out.println(Arrays.toString(ans));
  }
}
