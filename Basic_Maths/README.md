# Notes

- Euclidean Algorithm is optimised solution to find gcd or hcf

```
GCD(a,b) = GCD(a-b,b) ; where a>b
GCD(a,b) = GCD(a%b,b) ; where a>b
```

```
TC = O(log(min(m,n)))
```

```java
while (a > 0 && b > 0) {
  if (a > b)
    a %= b;
  else
    b %= a;
}
return (a == 0) ? b : a;
```
