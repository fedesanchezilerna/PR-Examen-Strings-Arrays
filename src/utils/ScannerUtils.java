package utils;

import java.util.Scanner;

public class ScannerUtils {

    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt() {
        int number;
        while (true) {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Número inválido. Ingresa un INT: ");
            }
        }
        return number;
    }

    public static void closeScanner() {
        scanner.close();
    }
}

