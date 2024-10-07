package Java_Basics;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // integer related
        byte a = scanner.nextByte();
        short b = scanner.nextShort();
        int c = scanner.nextInt();
        long d = scanner.nextLong();

        // decimal related
        float e = scanner.nextFloat();
        double f = scanner.nextDouble();

        // string related
        char g = scanner.next().charAt(0);
        String h = scanner.next();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        scanner.close();
    }
}
