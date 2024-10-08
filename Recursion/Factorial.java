package Recursion;

public class Factorial {

    // Iterative
    // TC = O(n)
    static int factorial1(int n) {
        int factorial = 1;
        if (n == 0 || n == 1)
           return factorial;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Recursive
    static int factorial2(int n) {
        if (n == 0)
            return 1;
        return n * factorial2(n - 1);
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(factorial1(n));
        System.out.println(factorial2(n));
    }
}
