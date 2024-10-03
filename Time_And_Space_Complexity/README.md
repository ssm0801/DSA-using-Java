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

```java
Q1.

for(int i=1; i<=n; i++) {
    System.out.println("*");
}

==========================

loop goes from 1 to n, and in each iteration some constant work is done, lets say k
Total operation = k + k + k + ... k (n times)
                = n * k     [Avoid constant]
                = n
i.e O(n)
```

```java
Q2.

for(int i=1; i<=n; i++) {
    for(int j=1; j<=n; j++) {
        System.out.println("*");
    }
}

================================

outer loop goes from 1 to n, and in each iteration some work is done n times, lets say k work is done n times
Total operation = (n * k) + (n * k) + (n * k) + ... + (n * k) [n times]
                = nk + nk + nk + ... + nk (n times)
                = n * n * k
                = n^2 * k       [Avoid constant]
                = n^2
i.e O(n^2)
```

```java
Q3.

for(int i=1; i<=n; i++) {
    for(int j=1; j<=i; j++) {
        System.out.println("*");
    }
}

================================

outer loop goes from 1 to n, and in each iteration some work is done i (outer number) times, lets say k work is done in each iteration
Total operation = (1 * k) + (2 * k) + (3 * k) + ... + (n * k)
                = (1 + 2 + 3 + ... + n) * k
                = (n * (n + 1) * k) / 2     [Avoid constant]
                = n * n
                = n^2
i.e O(n^2)
```

```java
Q4.

for(int i=2; i*i<=n; i++) {
    if (n%i == 0) {
        System.out.println("Not prime");
        break;
    }
}

========================================

outer loop starts from i=2 till i*i <= n
i=2 to i^2<=n
i=2 to i<=sqrt(n)
it mean outer loop executes sqrt(n) times
i.e O(sqrt(n))
```

```java
Q5.

fact(int n) {
    if (n == 0) {
        return 1;
    }
    else {
        return n * fact(n-1);
    }
}

=============================

*** Approach 1 ***

T(n) = 1          ; n=0
     = T(n-1) * k ; n>0

T(n) = k + T(n-1)
     = k + k + T(n-2)
     = k + k + k + ... + k + T(n-n)   [n times]
     = k + k + k + ... + k + 1
     = nk + 1       [Avoid constant]
     = n

i.e O(n)

*** Approach 2 ***

lets say n=4

f(4) -> 4 * f(3) -> 3 * f(2) -> 2 * f(1) -> 1 * f(0)

for n=4 total calls are 5
so for n total calls will be n+1
work done in each call is constant k
= (n+1) * k     [Avoid constant]
= n

i.e O(n)
```

```java
Q6.

fib(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    else {
        return fib(n-1) + fib(n-2);
    }
}

===================================

*** Approach 1 ***

T(n) = 1          ; n<=1
     = T(n-1) + T(n-2) + k ; n>1

T(n) = T(n-1) + T(n-2) + k     [T(n-1) and T(n-2) will be same approx ]
     = 2 * T(n-1) + k
     = 2 * 2 * 2 * ... * 2 * T(n-n)   [n times]
     = 2^n

i.e O(2^n)

*** Approach 2 ***

follow below image, lets say n=4

Total calls = 2^0 + 2^1 + 2^3 + ... + 2^n   [Geometric Progression Sum]
            = (1 * (2^n - 1)) / (2 - 1)
            = 2^n - 1
            = 2^n

i.e O(2^n)
```

![Fibonacci Recursion tree](https://github.com/ssm0801/DSA-using-Java/blob/master/Time_And_Space_Complexity/fib.jpg)

```java
Q7.

int i=1;
int s=1;
while (s <= n) {
    i++;
    s=s+i
    System.out.println("*");
}

============================

lets say n=3
i = 1,2,3
each time i is added in s
s = 1+2+3

therefore for k times
s = 1 + 2 + 3 + ... + k
  = (k * (k + 1)) / 2
  = (k^2 + k) / 2

loop stops when s>n
therefore,

(k^2 + k) / 2 = n
k^2 + k = 2n    [Avoid constant and ignore lower values]
    k^2 = n
      k = sqrt(n)
   O(k) = O(sqrt(n))

i.e O(sqrt(n))
```

```java
Q8.

for(int i=n/2; i<=n; i++) {
    for(int j=1; j+n/2<=n; j++) {
        for(int k=1; k<=n; k=k*2) {
            System.out.println("*");
        }
    }
}

====================================

let say n=10
i loop will execute for 5 to 10 = 5 times = 10/2 times = n/2 times
j loop will execute for 1 to 5 (j<=n-n/2) times = 5 times = 10/2 times = n/2 times
k loop will execute for 1,2,4,8 = 4 times = log 10 base 2 = log n times

therefore
= n/2 * n/2 * log n     [Avoid constant]
= n^2 * log n

i.e O(n^2 * log n)
```

```java
Q9.

for(int i=1; i<=n; i++) {
    for(int j=1; j<=n; j++) {
        System.out.println("*");
        break;
    }
}

================================

outerloop will execute for n times, but in each iteration inner loop will execute for only one time due to break
= 1 + 1 + ... + 1   [n times]
= 1 * n
= n

i.e O(n)
```

```java
Q10.

Sum of log i, where i is from 1 to n

====================================

= log 1 + log 2 + ... + log n
= log (1 * 2 * 3 * ... * n)
= log (n!)  [log (n!) <= log (n^n)]
= log (n^n)
= n * log n

i.e O(n * log n)
```

```java
Q11.

fun(int n) {
    if (n <= 1) {
        return 1;
    }
    for (int i=1; i<=3; i++) {
        fun(n-1)
    }
}

==============================

T(n) = k                ; n<=1
     = 3 * T(n-1) + k   ; n>1

T(n) = 3 * T(n-1) + k   [Avoid constant]
     = 3 * T(n-1)
     = 3 * 3 * T(n-2)
     = 3 * 3 * ... * 3  [n times]
     = 3^n

i.e O(3^n)
```

```java
Q12.

int i=1,j;
while (i<=n) {
    j=n;
    while (j>0) {
        j=j/2;
    }
    i=2*i;
}

=================

inside inner while loop j is decreaing by 2 each time, it means it will execute for log n times
inside outer while loop i is increasing by 2 each time, it means it will also execute for log n times
= log n * log n
= log^2 n

i.e O(log^2 n)
```

```java
Q13.

fun(int n) {
    int n;
    if (n<2) {
        return 1;
    }
    else {
        c=0;
    }
    for (int i=1; i<=8; i++) {
        fun(n/2);
    }
    for (int i=1; i<=n^3; i++) {
        c++;
    }
}

================================

T(n) = 1                     ; n<2
     = 8 * T(n/2) + n^3 + k  ; n>=2

T(n) = 8 * T(n/2) + n^3 + k     [Avoid constand and ignore lower values]
     = n^3

i.e O(n^3)
```

```java
Q14.

T(n) = 1                ; n=1
     = T(n-1) + n*(n-1) ; n>=2

==============================

T(n) = T(n-1) + n*(n-1)
     = T(n-2) + (n-1)*(n-2) + n*(n-1)
     = T(1) + 2*1 + 3*2 + ... + n*(n-1)
     = Sumation of i*(i-1)  [i = 1 to n]
     = Summation of i^2 - Summation of i    [Ignore lower values]
     = n(n+1)(2n+1) / 6     [Avoid constant and ignore lower values]
     = n^3

i.e O(n^3)
```

```java
Q15.

for(int i=1; i<=n; i++) {
    for(int j=1; j<=n; j+=i) {
        System.out.println("*");
    }
}
```
