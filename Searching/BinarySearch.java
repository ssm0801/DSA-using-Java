public class BinarySearch {
    
    // O(log n)
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
    
    // recursive
    // O(log n)
    static int binarySearch1(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (target > arr[mid]) {
            return binarySearch1(arr, target, mid + 1, high);
        }
        else if (target < arr[mid]) {
            return binarySearch1(arr, target, low, mid - 1);
        }
        return mid;
    }
    
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 13, 20, 24, 26, 32, 46, 52, 75};
        int target = 46;
        int result = binarySearch1(arr, target, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
