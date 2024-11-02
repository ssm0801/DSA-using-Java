package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question3 {

  // bruteforce
  // can have new array with unique elements
  // SC : O(n)
  // TC : O(n)
  public static int[] removeDuplicates1(int[] arr) {
    Set<Integer> set = new HashSet<>();
    for (Integer value : arr) {
      set.add(value);
    }
    Iterator<Integer> itr = set.iterator();
    while (itr.hasNext()) {
      set.add(itr.next());
    }
    return set.stream().mapToInt(Integer::intValue).toArray();
  }

  // optimised
  // remove duplicates in sorted array and take remaining numbers as -1
  // two pointer
  // SC : O(1)
  // TC : O(n)
  public static void removeDuplicates2(int[] arr) {
    int i = 0;
    int j = 0;
    while (j < arr.length) {
      if (arr[i] != arr[j]) {
        i++;
        arr[i] = arr[j];
      }
      j++;
    }
    for (int k = i + 1; k < arr.length; k++) {
      arr[k] = -1;
    }
  }

  public static void main(String[] args) {
    int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    // int[] removedDuplicates = removeDuplicates1(arr);
    removeDuplicates2(arr);
    System.out.println("Removed duplicates = " + Arrays.toString(arr));
  }
}
