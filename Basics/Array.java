import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
        // default values are 0
        int[] arr3 = new int[5];

        int[][] arr4 = { {1, 2}, {3, 4, 5} };
        int[][] arr5= new int[][] { {1, 2, 3}, {4}, {5} };
        // default values are 0
        int[][] arr6 = new int[5][4];
        // wont have default values, each row will be null
        int[][] arr7 = new int[5][];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        
        for (int[] row : arr4) {
            System.out.println(Arrays.toString(row));
        }
        for (int[] row : arr5) {
            System.out.println(Arrays.toString(row));
        }
        for (int[] row : arr6) {
            System.out.println(Arrays.toString(row));
        }
        for (int[] row : arr7) {
            System.out.println(Arrays.toString(row));
        }
    }
}
