package Arrays;

public class Question6 {

  // check if the sorted array is rotated
  // SC : O(1)
  // TC : O(n)
  static boolean isSorted(int[] arr) {
    int n = arr.length;
    for (int i = 0; i <= n - 2; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  // check if array is sorted rotated array
  // SC : O(1)
  // TC : O(n)
  static boolean isSortedAndRotated(int[] arr) {
    // 3, 4, 5, 1, 2
    int n = arr.length;
    int rotationPointCount = 0;
    for (int i = 0; i <= n - 2; i++) {
      if (arr[i] > arr[i + 1]) {
        rotationPointCount++;
      }
    }
    if (rotationPointCount == 0 && arr[0] <= arr[n - 1]) {
      return true;
    }
    if (rotationPointCount == 1 && arr[0] >= arr[n - 1]) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    // [3,4,5,1,2]
    // [2,1,3,4]
    // [1,2,3]
    int arr[] = { 6, 10, 6 };
    System.out.println(isSortedAndRotated(arr));
  }
}
