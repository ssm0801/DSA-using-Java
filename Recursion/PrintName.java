package Recursion;

public class PrintName {

    // TC = O(n)
    // SC = O(n)
    static void printName1(String name, int n) {
        if (n == 0)
            return;
        System.out.println(name);
        printName1(name, n - 1);
    }

    // TC = O(n)
    // SC = O(n)
    static void printName2(String name, int i, int n) {
        if (i > n)
            return;
        System.out.println(name);
        printName2(name, i + 1, n);
    }

    public static void main(String[] args) {
        String name = "John";
        int n = 5;
        printName1(name, n);
        printName2(name, 1, n);
    }
}
