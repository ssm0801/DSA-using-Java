public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target > arr[mid]) {
                low = mid + 1;
            }
            else if (target < arr[mid]) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 13, 20, 24, 26, 32, 46, 52, 75};
        int target = 46;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
