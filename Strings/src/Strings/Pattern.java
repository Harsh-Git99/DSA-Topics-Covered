package Strings;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        Pattern1(n);
        System.out.println("-------------------");
        Pattern2(n);
        System.out.println("-------------------");
        Pattern3(n);
        System.out.println("-------------------");
        Pattern4(n);
        System.out.println("-------------------");
        Pattern5(n);
        System.out.println("-------------------");
        Pattern6(n);
    }

    static void Pattern1(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void Pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void Pattern4(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(col + 1);
            }
            System.out.println();
        }
    }

    static void Pattern5(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = n-1; col >=row-1 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void Pattern6(int n){
        for (int row=0;row < 2*n; row++){
            int totalColsInRow = row > n ? 2* n - row : row;
            int noOfSpaces = n-totalColsInRow;
            for (int sp = 0; sp < noOfSpaces; sp++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
