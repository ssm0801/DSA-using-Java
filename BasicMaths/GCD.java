package BasicMaths;

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
    // GCD(a,b) = GCD(a-b,b) ; where a>b
    // GCD(a,b) = GCD(a%b,b) ; where a>b
    // TC = O(log(min(m,n)))
    static int gcd2(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2)
                n1 %= n2;
            else
                n2 %= n1;
        }
        return (n1 == 0) ? n2 : n1;
    }
    public static void main(String[] args) {
        int n1 = 52;
        int n2 = 10;
        System.out.println(gcd1(n1, n2));
        System.out.println(gcd2(n1, n2));
    }
}
