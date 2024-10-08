package Recursion;

public class Print1toN {

    // TC = O(n)
    // SC = O(n)
    static void print(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        print(i + 1, n);
    }

    // TC = O(n)
    // SC = O(n)
    static void printUsingBacktracking(int n) {
        if (n == 0)
            return;
        printUsingBacktracking(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 5;
        print(1, n);
        printUsingBacktracking(n);
    }
}
