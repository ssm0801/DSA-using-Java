package Recursion;

public class Fibonacci {

    // TC = O(2^n)
    static int fib1(int n) {
        if (n <= 1)
            return n;
        return fib1(n - 1) + fib1(n - 2);
    }

    // TC = O(n)
    static int fib2(int n) {
        if (n <= 1)
            return n;
        else {
            int first = 0;
            int second = 1;
            int next;
            for (int i = 1; i < n; i++) {
                next = first + second;
                first = second;
                second = next;
            }
            return second;
        }
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib1(n));
        System.out.println(fib2(n));
    }
}
