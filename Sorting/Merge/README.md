# Merge Sort

- Divide and Merge
- Time complexity is `O(n * log n)`

```java
int[] arr = {13, 46, 24, 52, 20, 9};
```

![Image](https://github.com/ssm0801/DSA-using-Java/blob/master/Sorting/Merge/merge.png)

- From above image its clear that we create hypothetical arrays by dividing in into two every time, and then while merging each two sibling arrays we sort it
- It is done using recursion
