package Arrays;

public class Question10 {

  // SC : O(1)
  // TC : O(n)
  static int maxConsecutiveOnes(int[] arr) {
    int count = 0;
    int max = 0;
    for (int i : arr) {
      if (i == 1) {
        count++;
        if (count > max) {
          max = count;
        }
      } else {
        count = 0;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 0, 1, 1, 0, 1 };
    int max = maxConsecutiveOnes(arr);
    System.out.println("Max consecutive ones = " + max);
  }
}
