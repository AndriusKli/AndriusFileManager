package lt.vtmc.ems;

import java.util.Scanner;

public class Menu {

    private boolean exit;
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Simple Java file manager ver. 1.0.\nSelect file operation");
        while (!exit) {
            fileOperation();
        }
    }

    private void fileOperation() {
        System.out.println("If you want to copy a file, press c. If you want to quit, press n. ");
        String read = input.next().toLowerCase();
        char close = read.charAt(0);
        switch (close) {
            case 'c':
                System.out.println("Input file name: ");
                String readFileName = input.next();
                System.out.println("Input new file name: ");
                String readNewFileName = input.next();
                FileCopy.copyByteByByte(readFileName, readNewFileName);
                exitMenu();
            case 'n':
                exit = true;
                break;
        }
    }

    private void exitMenu() {
        System.out.println("Exit? (y/n): ");
        String read = input.next().toLowerCase();
        char close = read.charAt(0);
        switch (close) {
            case 'n':
                exit = false;
                break;
            case 'y':
                exit = true;
                System.out.println("Good luck!");
                break;
            default:
                System.out.println("Wrong symbol!");
                break;
        }
    }
}
