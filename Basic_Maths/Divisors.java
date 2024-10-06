package Basic_Maths;

import java.util.ArrayList;
import java.util.List;

public class Divisors {

    // TC = O(n)
    static List<Integer> divisors1(int n) {
        List<Integer> divisors = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    // TC = O(√n)
    static List<Integer> divisors2(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                // if n is 36
                // 6 can't be added twice in divisors
                // so check the below condition
                if (i * i != n) {
                    divisors.add(n / i);
                }
            }
        }
        // sort the divisors
        divisors.sort(null);
        return divisors;
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.println(divisors1(n));
        System.out.println(divisors2(n));
    }
}
