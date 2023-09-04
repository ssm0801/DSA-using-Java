package Patterns;

// 1. outer loop is for rows, inner loop is for columns
// 2. for inner loop, focus on columns & connect them somehow to the rows
// 3. print inside inner loop only
// 4. observe symmetry [optional]

// look for below thing in patterns
// characters + spaces + characters

// revise 18, 21, 10, 12, 17, 20, 22

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

    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    static void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            int digit = 1;
            if (i % 2 == 1) digit = 0;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(digit + " ");
                digit = 1 - digit;
            }
            System.out.println();
        }
    }

    // 1        1   => line 1 - 1 digit + 8 space + 1 digit
    // 12      21   => line 2 - 2 digit + 6 space + 2 digit
    // 123    321   => line 3 - 3 digit + 4 space + 3 digit
    // 1234  4321   => line 4 - 4 digit + 2 space + 4 digit
    // 1234554321   => line 5 - 5 digit + 0 space + 5 digit
    static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            for (int j = 0; j < 2 * n - 2 * (i + 1); j++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    static void pattern13(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

    // A
    // AB
    // ABC
    // ABCD
    // ABCDE
    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((char)(65 + j));
            }
            System.out.println();
        }
    }

    // ABCDE
    // ABCD
    // ABC
    // AB
    // A
    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char)(65 + j));
            }
            System.out.println();
        }
    }

    // A
    // BB
    // CCC
    // DDDD
    // EEEEE
    static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((char)(65 + i));
            }
            System.out.println();
        }
    }

    //     A      => line 1 - 4 space + 1+0 char
    //    ABA     => line 2 - 3 space + 2+1 char
    //   ABCBA    => line 3 - 2 space + 3+2 char
    //  ABCDCBA   => line 4 - 1 space + 4+3 char
    // ABCDEDCBA  => line 5 - 0 space + 5+4 char
    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int mid = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < mid)
                    ch++;
                else
                    ch--;
            }
            System.out.println();
        }
    }

    // E           => line 1 - start E - 65 + 4 (5-1)
    // D E         => line 2 - start D - 65 + 3 (5-2)
    // C D E       => line 3 - start C - 65 + 2 (5-3)
    // B C D E     => line 4 - start B - 65 + 1 (5-4)
    // A B C D E   => line 5 - start A - 65 + 0 (5-5)
    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            // char ch = (char) (64 + n - i);
            char ch = (char) (65 + n - (i + 1));
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    // **********   => line 1 - i = 0 - 5 star + 0 space + 5 star
    // ****  ****   => line 2 - i = 1 - 4 star + 2 space + 4 star
    // ***    ***   => line 3 - i = 2 - 3 star + 4 space + 3 star
    // **      **   => line 4 - i = 3 - 2 star + 6 space + 2 star
    // *        *   => line 5 - i = 4 - 1 star + 8 space + 1 star
    // *        *   => line 6 - i = 0 - 1 star + 8 space + 1 star
    // **      **   => line 7 - i = 1 - 2 star + 6 space + 2 star
    // ***    ***   => line 8 - i = 2 - 3 star + 4 space + 3 star
    // ****  ****   => line 9 - i = 3 - 4 star + 2 space + 4 star
    // **********   => line 10 - i = 4 - 5 star + 0 space + 5 star
    static void pattern19(int n) {
        int spaces = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            spaces += 2;
            System.out.println();
        }

        spaces = 2 * n - 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            spaces -=2 ;
            System.out.println();
        }
    }

    // *        *   => i = 0 - 1 star + 8 space + 1 star
    // **      **   => i = 1 - 2 star + 6 space + 2 star
    // ***    ***   => i = 2 - 3 star + 4 space + 3 star
    // ****  ****   => i = 3 - 4 star + 2 space + 4 star
    // **********   => i = 4 - 5 star + 0 space + 5 star
    // ****  ****   => i = 5 - 4 star + 2 space + 4 star
    // ***    ***   => i = 6 - 3 star + 4 space + 3 star
    // **      **   => i = 7 - 2 star + 6 space + 2 star
    // *        *   => i = 8 - 1 star + 8 space + 1 star
    static void pattern20(int n) {
        int spaces = 2 * n - 2;
        for (int i = 0; i < 2 * n - 1; i++) {
            int stars = i + 1;
            if (i >= n) {
                stars = 2 * n - i - 1;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            if (i < n - 1) {
                spaces -= 2;
            }
            else {
                spaces += 2;
            }
            System.out.println();
        }
    }

    // *****   => stars are printed only on boundaries
    // *   *
    // *   *
    // *   *
    // *****
    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 4444444         0000000
    // 4333334         0111110
    // 4322234         0122210
    // 4321234   ===>  0123210
    // 4322234         0122210
    // 4333334         0111110
    // 4444444         0000000
    // subtract each number from 4 and get new matrix
    // in new matrix for each position, the value is its minimal distance from boundary
    static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 1) - 1 - j;
                int bottom = (2 * n - 1) - 1 - i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;

        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(n);
        pattern18(n);
        pattern19(n);
        pattern20(n);
        pattern21(n);
        pattern22(n);
    }
}
