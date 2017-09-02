package main;

public class PrintUtil {

    private void printOneAsterisk() {
        System.out.println("*");
    }

    private void printLineAsterisk(int n) {
        for (int i = 0; i <= n; i++) {
                System.out.printf("*");
        }
    }

    public static void main(String args[]) {
        PrintUtil printUtil = new PrintUtil();
        printUtil.printOneAsterisk();
        printUtil.printLineAsterisk(8);
    }
}
