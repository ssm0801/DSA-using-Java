# Insertion Sort

- Take an element and place it in its correct position on its left part
- Time complexity
  1. Worst & Avg = `O(n^2)`
  2. Best = `O(n)`

```java
int[] arr = {13, 10, 46, 12, 9, 52};
```

![Image](https://github.com/ssm0801/DSA-using-Java/blob/master/Sorting/Insertion/insertion.jpg)

- From above image its clear that outer loop `i` will run from `0` to `n-1` i.e `[0,n-1]`
- For inner loop `j` we will start from `i` till we find a index on which value should be less than the value on index i on the left side, so use while loop
