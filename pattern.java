public class JavaPatterns {

    public static void main(String[] args) {
        System.out.println("=== LEVEL 1: BASIC PATTERNS ===");
        solidSquare(5);
        rightTriangle(5);
        invertedRightTriangle(5);
        numberTriangle(5);
        zeroOneTriangle(5);
        floydsTriangle(5);

        System.out.println("\n=== LEVEL 2: SPACE-BASED PATTERNS ===");
        fullPyramid(5);
        invertedPyramid(5);
        hollowSquare(5);
        hollowPyramid(5);
        diamond(5);
        hollowDiamond(5);
        rhombus(5);

        System.out.println("\n=== LEVEL 3: NUMBER / CHARACTER PATTERNS ===");
        pascalsTriangle(5);
        palindromePyramid(5);
        alphabetTriangle(5);
        alphabetPyramid(5);
        numberPyramid(5);

        System.out.println("\n=== LEVEL 4: TRICKY PATTERNS ===");
        butterflyPattern(5);
        xPattern(5);
        plusPattern(5); // Best with an odd number
        hourglass(5);
        hollowButterfly(5);
        zigZagPattern(9); // Best with length = 9 or 13
    }

    // ==========================================
    // LEVEL 1 — BASIC PATTERNS
    // ==========================================

    // 1. Solid Square
    public static void solidSquare(int n) {
        System.out.println("\n1. Solid Square:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Right Triangle
    public static void rightTriangle(int n) {
        System.out.println("\n2. Right Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Inverted Right Triangle
    public static void invertedRightTriangle(int n) {
        System.out.println("\n3. Inverted Right Triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 4. Number Triangle
    public static void numberTriangle(int n) {
        System.out.println("\n4. Number Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 5. 0-1 Triangle
    public static void zeroOneTriangle(int n) {
        System.out.println("\n5. 0-1 Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // 6. Floyd's Triangle
    public static void floydsTriangle(int n) {
        System.out.println("\n6. Floyd's Triangle:");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // ==========================================
    // LEVEL 2 — SPACE-BASED PATTERNS
    // ==========================================

    // 7. Full Pyramid
    public static void fullPyramid(int n) {
        System.out.println("\n7. Full Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 8. Inverted Pyramid
    public static void invertedPyramid(int n) {
        System.out.println("\n8. Inverted Pyramid:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 9. Hollow Square
    public static void hollowSquare(int n) {
        System.out.println("\n9. Hollow Square:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 10. Hollow Pyramid
    public static void hollowPyramid(int n) {
        System.out.println("\n10. Hollow Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 11. Diamond
    public static void diamond(int n) {
        System.out.println("\n11. Diamond:");
        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }

    // 12. Hollow Diamond
    public static void hollowDiamond(int n) {
        System.out.println("\n12. Hollow Diamond:");
        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 13. Rhombus
    public static void rhombus(int n) {
        System.out.println("\n13. Rhombus:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ==========================================
    // LEVEL 3 — NUMBER / CHARACTER PATTERNS
    // ==========================================

    // 14. Pascal's Triangle
    public static void pascalsTriangle(int n) {
        System.out.println("\n14. Pascal's Triangle:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    // 15. Palindrome Pyramid
    public static void palindromePyramid(int n) {
        System.out.println("\n15. Palindrome Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print("  ");
            for (int j = i; j >= 1; j--) System.out.print(j + " ");
            for (int j = 2; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    // 16. Alphabet Triangle
    public static void alphabetTriangle(int n) {
        System.out.println("\n16. Alphabet Triangle:");
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }

    // 17. Alphabet Pyramid
    public static void alphabetPyramid(int n) {
        System.out.println("\n17. Alphabet Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print("  ");
            
            char ch = 'A';
            // Ascending
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            // Descending
            ch -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }

    // 18. Number Pyramid
    public static void numberPyramid(int n) {
        System.out.println("\n18. Number Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // ==========================================
    // LEVEL 4 — TRICKY PATTERNS
    // ==========================================

    // 19. Butterfly Pattern
    public static void butterflyPattern(int n) {
        System.out.println("\n19. Butterfly Pattern:");
        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        // Lower Half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 20. X Pattern
    public static void xPattern(int n) {
        System.out.println("\n20. X Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == (n - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 21. Plus Pattern
    public static void plusPattern(int n) {
        System.out.println("\n21. Plus Pattern:");
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == mid || j == mid) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 22. Hourglass
    public static void hourglass(int n) {
        System.out.println("\n22. Hourglass:");
        // Upper Half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        // Lower Half
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }

    // 23. Hollow Butterfly
    public static void hollowButterfly(int n) {
        System.out.println("\n23. Hollow Butterfly:");
        // Upper Half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        // Lower Half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 24. Zig-Zag Pattern
    public static void zigZagPattern(int n) {
        System.out.println("\n24. Zig-Zag Pattern:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= n; j++) {
                if (((i + j) % 4 == 0) || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
