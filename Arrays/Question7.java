package Arrays;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Question7 {

  // union of two arrays containing duplicates
  // SC : O(n)
  // TC : O((m+n) * log (m+n))
  static int[] union(int[] a, int[] b) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i : a) {
      hm.put(i, hm.getOrDefault(i, 0) + 1);
    }
    for (int i : b) {
      hm.put(i, hm.getOrDefault(i, 0) + 1);
    }
    return hm.keySet().stream().mapToInt(Integer::intValue).toArray();
  }

  // union of two sorted arrays containing duplicates
  // SC : O(n)
  // TC : O((m+n) * log (m+n))
  static int[] unionOfSorted(int[] a, int[] b) {
    SortedMap<Integer, Integer> hm = new TreeMap<>();
    for (int i : a) {
      // put will take log(n) time
      hm.put(i, (hm.getOrDefault(i, 0) + 1));
    }
    for (int i : b) {
      hm.put(i, (hm.getOrDefault(i, 0) + 1));
    }
    int union[] = new int[hm.size()];
    int index = 0;
    for (int key : hm.keySet()) {
      union[index++] = key;
    }
    return union;
  }

  // optimised
  // SC : O(n)
  // TC : O(m+n)
  static int[] unionOfSortedOptimised(int[] a, int[] b) {
    List<Integer> list = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < a.length && j < b.length) {
      if (a[i] <= b[j]) {
        if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
          list.add(a[i]);
        }
        i++;
      } else {
        if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
          list.add(b[j]);
        }
        j++;
      }
    }
    while (i < a.length) {
      if (list.get(list.size() - 1) != a[i]) {
        list.add(a[i]);
      }
      i++;
    }
    while (j < b.length) {
      if (list.get(list.size() - 1) != b[j]) {
        list.add(b[j]);
      }
      j++;
    }
    return list.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    // int arr1[] = { -2, 0, 2, -3, 70, -3, 1, 0, 0, -8, 2, 6, 9 };
    // int arr2[] = { 9, 0, 6, -7, 36, 12, -9, -12, -3 };
    // int arr3[] = union(arr1, arr2);
    int arr1[] = { -8, -3, -3, -2, 0, 1, 2, 2, 6 };
    int arr2[] = { -9, -9, 0 };
    // int arr3[] = unionOfSorted(arr1, arr2);
    int arr3[] = unionOfSortedOptimised(arr1, arr2);
    System.out.println("Union = " + Arrays.toString(arr3));
  }
}
