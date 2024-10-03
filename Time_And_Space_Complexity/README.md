# Time Complexity (TC)

- Rate at which time taken increaes with respect to input size

`TC = O(f(input size)) = O(f(n))`

### Notations

| Name   | Symbol | Case  |
| :----- | :----- | :---- |
| Big Oh | O()    | Worst |
| Theta  | Θ()    | Avg   |
| Omega  | Ω()    | Best  |

### Rules

- TC is always considered in Worst Case
- Avoid constants
- Consider highest value only

### Time Complexity Graph

![Image](https://miro.medium.com/v2/resize:fit:720/format:webp/0*sHLx8GgoVye4Ku2c.png)

### Time Complexity Order

![Image](https://miro.medium.com/v2/resize:fit:1400/1*bYdM8goHjaYSlqWqrjHU8w.png)

### Time Complexity for recusion

- For recusion TC can be calculated in two ways
  1. Recurrance relation
  2. TC = Total no. of recursive calls \* Work done in each call

# Space Complexity (SC)

- Extra memory/space which is required for algorithm like variables i.e auxiliary space
- The order of that auxiliary space is SC, like for array it is `n`, for single variables it is `1`
- For decreasing SC, input variables should not be changed

### Space Complexity for recusion

- Call stack has to be considered for recursion functions
- For each new recursive call new entry is added in call stack
- SC = Depth of recursion tree \* Memory used in each call

### Imp formulas

![Image](https://slideplayer.com/slide/9174561/27/images/7/Summation+Formulas+Theorem.jpg)

![Image](https://lh4.googleusercontent.com/6fItZyh2w-o7iIhOMZlq3PgcCWrTuG0p9vZ6CrKoK6DZ1tv2mavO_4oDhqvV3cv94jxOQdeulVDrDZk4H8ji7Z5Za1aViJucFISa3CBBPoPFScMjHP_uLIfWcj9rUNc4F8oxdLVK)

![Image](https://cdn1.byjus.com/wp-content/uploads/2021/07/sum-to-n-terms-of-a-g-p.png)

## Problems

```
1.
```
