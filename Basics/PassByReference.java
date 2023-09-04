package Basics;

import java.util.Arrays;

public class PassByReference {
    static void modifyArray(int[] arr) {
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
    }
    public static void main(String[] args) {
        int[] arr = new int[3];
        // it will print [0, 0, 0]
        System.out.println(Arrays.toString(arr));
        modifyArray(arr);
        // it will print [1, 2, 3]
        System.out.println(Arrays.toString(arr));
    }
}
