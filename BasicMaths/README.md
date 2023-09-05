# Notes

- euclidean algorithm is important
- it is optimised solution to find gcd or hcf

```
GCD(a,b) = GCD(a-b,b) ; where a>b
GCD(a,b) = GCD(a%b,b) ; where a>b
```

```
TC = O(log(min(m,n)))
```

```java
while (n1 > 0 && n2 > 0) {
if (n1 > n2)
n1 %= n2;
else
n2 %= n1;
}
if (n1 == 0)
return n2;
else
return n1;
```
