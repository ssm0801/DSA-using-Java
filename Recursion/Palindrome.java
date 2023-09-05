package Recursion;

public class Palindrome {

    // TC = O(n/2)
    static boolean isPalindrome(String str, int start, int end) {
        // below condition means compared all indexes and were equal
        if (start >= end)
            return true;
        // if any match is not equal return false
        if (str.charAt(start) != str.charAt(end))
            return false;
        // for i < n/2 if it is equal check for next match
        return isPalindrome(str, start + 1, end - 1);
    }
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(isPalindrome(str, 0, str.length() - 1));
    }
}
