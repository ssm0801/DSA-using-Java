package Arrays;

public class Question1 {

  // largest element in an array
  // SC : O(1)
  // TC : O(n)
  public static int largestElement(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  // smallest element in an array
  // SC : O(1)
  // TC : O(n)
  public static int smallestElement(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
    int[] arr = { 13, 46, 24, 52, 20, 9, 75, 26, 7, 8, 32 };
    System.out.println("Smallest element = " + smallestElement(arr));
    System.out.println("Largest element = " + largestElement(arr));
  }
}
