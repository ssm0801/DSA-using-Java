package Recursion;

public class PrintNto1 {

    // TC = O(n)
    // SC = O(n)
    static void print1(int i, int n) {
        if (i == 0)
            return;
        System.out.println(i);
        print1(i - 1, n);
    }

    // TC = O(n)
    // SC = O(n)
    static void print2(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        print2(n - 1);
    }

    // TC = O(n)
    // SC = O(n)
    // printUsingBacktracking
    static void printUsingBacktracking(int i, int n) {
        if (i > n)
            return;
        printUsingBacktracking(i + 1, n);
        System.out.println(i);
    }

    static void sumTillN(int n) {

    }

    public static void main(String[] args) {
        int n = 5;
        print1(n, n);
        print2(n);
        printUsingBacktracking(1, n);
    }
}
