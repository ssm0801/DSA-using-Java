package BasicMaths;

public class PrimeNumber {

    // TC = O(n)
    static boolean isPrime1(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // TC = O(√n)
    static boolean isPrime2(int n ) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 59;
        System.out.println(isPrime1(n));
        System.out.println(isPrime2(n));
    }
}
