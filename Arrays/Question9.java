package Arrays;

public class Question9 {

  // missing number from 0 to n among n distinct numbers
  // bruteforce
  // SC : O(1)
  // TC : O(n^2)
  static int missingNum(int[] arr) {
    boolean flag = false;
    int n = arr.length;
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= n - 1; j++) {
        if (arr[j] == i) {
          flag = true;
          break;
        }
      }
      if (!flag) {
        return i;
      }
      flag = false;
    }
    return -1;
  }

  // better
  // SC : O(n)
  // TC : O(n)
  static int missingNumBetter(int[] arr) {
    int num = -1;
    int n = arr.length;
    int hm[] = new int[n + 1];
    for (int i : arr) {
      hm[i] = 1;
    }
    for (int i = 0; i < n; i++) {
      if (hm[i] == 0) {
        num = i;
        break;
      }
    }
    return num;
  }

  // optimised
  // SC : O(1)
  // TC : O(n)
  static int missingNumOptimised(int[] arr) {
    int n = arr.length;
    int sum = (n * (n + 1)) / 2;
    for (int i : arr) {
      sum -= i;
    }
    return sum;
  }

  public static void main(String[] args) {
    int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    int num = missingNumBetter(arr);
    System.out.println("Missing number = " + num);
  }
}
