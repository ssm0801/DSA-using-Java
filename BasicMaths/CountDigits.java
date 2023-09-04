package BasicMaths;

public class CountDigits {
    // normal method
    // TC = O(log10(n))
    static int countDigits1(int n) {
        int count = 0;
        // 'n' can be negative number
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    // using string
    // TC = O(log10(n))
    static int countDigits2(int n) {
        String str = Integer.toString(n);
        return str.length();
    }
    public static void main(String[] args) {
        int n = -123;
        System.out.println(countDigits1(n));
    }
}
