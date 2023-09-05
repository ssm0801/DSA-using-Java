package Recursion;

public class SumTillN {

    // TC = O(n)
    // parameterised recursion
    static void sum1(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum1(n - 1, sum + n);
    }

    // parameterised recursion
    static int sum2(int n) {
        if (n == 0)
            return 0;
        return n + sum2(n - 1);
    }

    public static void main(String[] args) {
        int n = 15;
        sum1(n, 0);
        System.out.println(sum2(n));
    }
}
