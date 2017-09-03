package main;

public class PrintUtil {
    private PrintUtil printOneAsterisk() {
        System.out.println("*");
        return this;
    }

    private PrintUtil printHorizontalLineAsterisk(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        return this;
    }

    private PrintUtil printVerticalLineAsterisk(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        return this;
    }

    private PrintUtil printRightTriangleAsterisk(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return this;
    }

    private PrintUtil printTriangleAsterisk(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        return this;
    }

    private PrintUtil printDelimiter() {
        System.out.println("\n" + "===================");
        return this;
    }

    public static void main(String args[]) {
        PrintUtil printUtil = new PrintUtil()
                .printOneAsterisk().printDelimiter()
                .printHorizontalLineAsterisk(8).printDelimiter()
                .printVerticalLineAsterisk(3).printDelimiter()
                .printRightTriangleAsterisk(4).printDelimiter()
                .printTriangleAsterisk(3).printDelimiter();
    }
}
