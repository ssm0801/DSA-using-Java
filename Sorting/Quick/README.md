# Quick Sort

- Consider pivot as first index element
- Take a pivot and place it at its correct position
- Time complexity is `O(n * log n)`

```java
int[] arr = {7, 6, 10, 5, 9, 2, 1, 15, 7};
```

![Image](https://github.com/ssm0801/DSA-using-Java/blob/master/Sorting/Quick/quick.png)

- We create pivot every time and place it at its correct position by placing smaller values than pivot on left and bigger values on right, done using loop
- Similiar to merge sort, we do Divide and Conquer method, done using recursion
