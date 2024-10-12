package Recursion;

import java.util.Arrays;

public class ReverseArray {

    // Iterative
    // TC = O(n)
    static int[] reverseArray1(int[] arr) {
        int[] tempArr = arr.clone();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = tempArr[start];
            tempArr[start] = tempArr[end];
            tempArr[end] = temp;
            start++;
            end--;
        }
        return tempArr;
    }

    // Recursive
    // TC = O(n)
    static void reverseArray2(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray2(arr, start + 1, end - 1);
        }
    }

    // Recursive
    // TC = O(n)
    static void reverseArray3(int[] arr, int i) {
        int n = arr.length;
        if (i >= n / 2)
            return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverseArray3(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 48, 24, 87, 95, 5 };
        System.out.println(Arrays.toString(reverseArray1(arr)));
        System.out.println(Arrays.toString(arr));
        reverseArray2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        reverseArray3(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
