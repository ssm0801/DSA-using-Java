package Basic_Maths;

// GCD and HCF are same
public class GCD {

    // TC = O(min(m,n))
    static int gcd1(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // Euclidean algorithm
    // TC = O(log(min(m,n)))
    static int gcd2(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b)
                a %= b;
            else
                b %= a;
        }
        return (a == 0) ? b : a;
    }

    public static void main(String[] args) {
        int n1 = 52;
        int n2 = 10;
        System.out.println(gcd1(n1, n2));
        System.out.println(gcd2(n1, n2));
    }
}
