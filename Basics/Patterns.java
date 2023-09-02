// 1. outer loop is for rows, inner loop is for columns
// 2. for inner loop, focus on columns & connect them somehow to the rows
// 3. print inside inner loop only
// 4. observe symmetry [optional]

public class Patterns {

    // *****
    // *****
    // *****
    // *****
    // *****
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *
    // **
    // ***
    // ****
    // *****
    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 1
    // 12
    // 123
    // 1234
    // 12345
    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    // 1
    // 22
    // 333
    // 4444
    // 55555
    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    // *****
    // ****
    // ***
    // **
    // *
    static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 12345
    // 1234
    // 123
    // 12
    // 1
    static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    //     *       => 4 space then 1 star
    //    ***      => 3 space then 3 star
    //   *****     => 2 space then 5 star
    //  *******    => 1 space then 7 star
    // *********   => 0 space then 9 star
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // *********   => 0 space then 9 star
    //  *******    => 1 space then 7 star
    //   *****     => 2 space then 5 star
    //    ***      => 3 space then 3 star
    //     *       => 4 space then 1 star
    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * n) - (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //     *       => 4 space then 1 star
    //    ***      => 3 space then 3 star
    //   *****     => 2 space then 5 star
    //  *******    => 1 space then 7 star
    // *********   => 0 space then 9 star
    //  *******    => 1 space then 7 star
    //   *****     => 2 space then 5 star
    //    ***      => 3 space then 3 star
    //     *       => 4 space then 1 star
    static void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    // *      => line 1 - 1 star
    // **     => line 2 - 2 star
    // ***    => line 3 - 3 star
    // ****   => line 4 - 4 star
    // *****  => line 5 - 5 star
    // ****   => line 6 - 4 star
    // ***    => line 7 - 3 star
    // **     => line 8 - 2 star
    // *      => line 9 - 1 star
    static void pattern10(int n) {
        // pattern2(n);
        // pattern5(n-1);

        for (int i = 0; i < 2 * n - 1; i++) {
            int stars = i + 1;
            if (i >= n) stars = 2 * n - i - 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;

        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern10(n);
    }
}
