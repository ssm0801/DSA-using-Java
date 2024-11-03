package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Question8 {

  // intersection of two arrays
  // bruteforce
  // SC : O(n + min(m,n))
  // TC : O((m+n) * log (m+n))
  static int[] intersection(int[] a, int[] b) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    for (int i : a) {
      hm.put(i, hm.getOrDefault(i, 0) + 1);
    }
    for (int i : b) {
      if (hm.containsKey(i) && hm.get(i) > 0) {
        list.add(i);
        hm.put(i, hm.getOrDefault(i, 0) - 1);
      }
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
  }

  // intersection of two sorted arrays
  // optimised
  // SC : O(n)
  // TC : O(m+n)
  static int[] intersectionOfSorted(int[] a, int[] b) {
    List<Integer> list = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < a.length && j < b.length) {
      if (a[i] < b[j]) {
        i++;
      } else if (a[i] == b[j]) {
        list.add(a[i]);
        i++;
        j++;
      } else {
        j++;
      }
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    // int arr1[] = { -12, 0, 2, -3, 70, -3, 1, 0, 0, -8, 2, 6, 9, -9 };
    // int arr2[] = { 9, 1, 0, 6, -7, 36, 12, -9, 0, 0, -12, -3 };
    // int arr3[] = intersection(arr1, arr2);
    int arr1[] = { -8, -3, -3, -2, 0, 1, 2, 2, 3, 6 };
    int arr2[] = { -9, -9, -3, 0, 2, 3, 3, 5, 6 };
    int arr3[] = intersectionOfSorted(arr1, arr2);
    System.out.println("Union = " + Arrays.toString(arr3));

  }
}
