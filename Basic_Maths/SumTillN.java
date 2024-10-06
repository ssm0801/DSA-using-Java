package Basic_Maths;

public class SumTillN {

    // TC = O(n)
    static int sum1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // TC = O(1)
    // using formula n(n+1)/2
    static int sum2(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum1(n));
        System.out.println(sum2(n));
    }
}
