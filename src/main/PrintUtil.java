package main;

public class PrintUtil {
    private PrintUtil printOneAsterisk() {
        System.out.println("*");
        return this;
    }

    private PrintUtil printHorizontalLineAsterisk(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print("*");
        }
        return this;
    }

    private PrintUtil printVerticalLineAsterisk(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println("*");
        }
        return this;
    }

    public static void main(String args[]) {
        PrintUtil printUtil = new PrintUtil()
                .printOneAsterisk()
                .printHorizontalLineAsterisk(8)
                .printVerticalLineAsterisk(3);
    }
}
