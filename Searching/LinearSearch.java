public class LinearSearch {

	// O(n)
	static int linearSearch(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 13, 46, 24, 52, 20, 9, 75, 26, 7, 8, 32 };
		int n = 78;
		int index = linearSearch(arr, n);
		if (index != -1) {
			System.out.println(n + " is present at " + index);
		} else {
			System.out.println(n + " is not present");
		}
	}
}
