package Arrays;

public class Question17 {

  // find max profit in one transaction only
  // SC : O(1)
  // TC : O(n)
  // if you sell on ith day
  // then you have to buy it on min between 0 to (i-1)th day
  static int maxProfit(int[] arr) {
    int buyPrice = arr[0];
    int profit = 0;
    for (int i : arr) {
      profit = Math.max(profit, i - buyPrice);
      if (i < buyPrice) {
        buyPrice = i;
      }
    }
    return profit;
  }

  public static void main(String[] args) {
    int arr[] = { 7, 1, 5, 3, 6, 4 };
    int profit = maxProfit(arr);
    System.out.println("Max profit = " + profit);
  }
}
