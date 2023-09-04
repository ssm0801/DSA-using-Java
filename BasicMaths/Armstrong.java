package BasicMaths;

public class Armstrong {
    static boolean isArmstrong(int n) {
        int sum = 0, temp = n;
        while (temp != 0) {
            sum += (int) Math.pow(temp % 10, 3);
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }
}
