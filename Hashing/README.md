# Hashing

Hashing is combination of below two steps:

1. Pre storing the frequency of each number i.e O(n)
2. Fetching it directly i.e O(1)

```java
  HashMap<Integer, Integer> hm = new HashMap<>();
  for (int i = 0; i < n; i++) {
    int key = arr[i];
    int freq = 0;
    if (hm.containsKey(key))
      freq = hm.get(key);
    freq++;
    hm.put(key, freq);
  }
```

## Points

- But in java max array size is 10^8
- Hashing can be used for number, characters
- Lowercase - 26, Uppercase - 26, All - 256

### Hashing methods

1. Division
2. Folding
3. Mid-Square

### Division Method

- If you have numbers `[2, 5, 16, 28, 139]` and constraint is array can be of max size 10
- Then you need to map each number greator than 10 to a number less than 10 some how
- In this case we can do modulo hashing (hashing function)
  `hash[arr[i]%10]`

  ```
  2 % 10 = 2
  5 % 10 = 5
  16 % 10 = 6
  28 % 10 = 8
  139 % 10 = 9
  ```

  ![Image](https://static.takeuforward.org/wp/uploads/2023/01/Screenshot-2023-01-28-191448.png)

- This way we can map all the numbers in limited size array
- But if we have two numbers with same reminder then they will cause collision, so will use linear chaining in that case

  `a = [2, 5, 16, 28, 139, 38, 48, 28, 18]`

  ![Image](https://static.takeuforward.org/wp/uploads/2023/01/Screenshot-2023-01-28-191630.png)

- But if all the numbers in given array has same reminder like `[8, 18, 28, 38, 48, 58, 68, ….., 1008]` then we end up having a linear chain of all numbers at single index

  ![Image](https://static.takeuforward.org/wp/uploads/2023/01/Screenshot-2023-01-28-192940.png)
