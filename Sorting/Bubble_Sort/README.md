# Bubble Sort

- Push element to the last by adjacent swapping
- Time complexity
  1. Worst & Avg = `O(n^2)`
  2. Best (optimised) = `O(n)`

```java
int[] arr = {13, 46, 24, 52, 20, 9};
```

![Image](https://github.com/ssm0801/DSA-using-Java/blob/master/Sorting/Bubble_Sort/images/bubble.jpg)

![Image](https://github.com/ssm0801/DSA-using-Java/blob/master/Sorting/Bubble_Sort/images/loop.png)

- From above image its clear that outer loop `i` will run from `n-1` to `1` i.e `[n-1,1]`
- For inner loop `j` we will start from `0` till `i-1` every time to bring max at end of that iteration limit i.e `[0,i-1]`
