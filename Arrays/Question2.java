package Arrays;

public class Question2 {

  // second largest element in an array
  public static int secondLargestElement(int[] arr) {
    int largest = arr[0];
    int secondLargest = -1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] != largest) {
        secondLargest = arr[i];
      }
    }
    return secondLargest;
  }

  // second smallest element in an array
  public static int secondSmallestElement(int[] arr) {
    int smallest = arr[0];
    int secondSmallest = -1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < smallest) {
        secondSmallest = smallest;
        smallest = arr[i];
      } else if (arr[i] < secondSmallest && arr[i] != smallest) {
        secondSmallest = arr[i];
      }
    }
    return secondSmallest;
  }

  public static void main(String[] args) {
    int[] arr = { 13, 7, 46, 24, 7, 52, 20, 9, 75, 26, 52, 7, 8, 75, 75, 75, 32 };
    System.out.println("Second smallest element = " + secondSmallestElement(arr));
    System.out.println("Second largest element = " + secondLargestElement(arr));
  }
}
