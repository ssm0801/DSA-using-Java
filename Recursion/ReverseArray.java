package Recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

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

    // TC = O(n)
    static void reverseArray2(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray2(arr, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {48,24,87,95,5};
        System.out.println(Arrays.toString(reverseArray1(arr)));
        System.out.println(Arrays.toString(arr));
        reverseArray2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
