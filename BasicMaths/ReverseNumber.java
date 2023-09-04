package BasicMaths;

public class ReverseNumber {

    // TC = O(log10(n))
    static int reverseNumber(int n) {
        int reversedNumber = 0;
        // 'n' can be negative number
        while(n != 0) {
            reversedNumber = (reversedNumber * 10) + (n % 10);
            n /= 10;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        int n = 15342369;
        System.out.println(reverseNumber(n));
    }
}
