package Basics;

public class Recursion {
    static void print(String name, int n) {
        if (n == 0)
            return;
        System.out.println(name);
        print(name, --n);
    }
    public static void main(String[] args) {
        String name = "Sudhanshu";
        int n = 5;
        print(name, n);
    }
}
