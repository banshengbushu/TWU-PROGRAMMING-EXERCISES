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

    private PrintUtil printTriangleAsterisk(int n,boolean isExistBlankFirstLine) {
        int flag = isExistBlankFirstLine ? 0 : 1;

        for (int i = 0; i < n-flag; i++) {
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

    private PrintUtil printRevereAsterisk(int n, boolean isExistBlankFirstLine) {
        int flag = isExistBlankFirstLine ? 0 : 1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + flag; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (n - 1 - flag - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        return this;
    }

    private PrintUtil printDiamondAsterisk(int n) {
        printTriangleAsterisk(n,true).printRevereAsterisk(n, false);
        return this;
    }

    private PrintUtil printDiamondWithName(int n) {
        printTriangleAsterisk(n,false);
        System.out.println("Bill");
        printRevereAsterisk(n, false);
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
                .printDiamondAsterisk(7).printDelimiter()
                .printDiamondWithName(4).printDelimiter();

    }
}
