package BasicMaths;

import static BasicMaths.ReverseNumber.reverseNumber;

public class Palindrome {

    // TC = O(log10(n))
    static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int reversedNumber = reverseNumber(n);
        return reversedNumber == n;
    }
    public static void main(String[] args) {
        int n = -12321;
        System.out.println(isPalindrome(n));
    }
}
