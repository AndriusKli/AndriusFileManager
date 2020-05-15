package lt.vtmc.ems;

import java.util.Scanner;

public class Menu {

    private char exit;
    private Scanner input = new Scanner(System.in);

    public void start() {
            while (exit != 'y') {
                System.out.println("Simple Java file manager ver. 1.0.\nSelect file operation");
                fileOperation();
                exitMenu();
            }
    }

    private void fileOperation() {
        System.out.println("If you want to copy a file, press c: ");
        String read = input.next().toLowerCase();
        if (read.charAt(0) == 'c'){
            System.out.println("Input file name: ");
            String readFileName = input.next();
            System.out.println("Input new file name: ");
            String readNewFileName = input.next();
            FileCopy fc = new FileCopy(readFileName, readNewFileName);
            fc.copyByteByByte();
        }
    }

    private void exitMenu() {
        System.out.println("Continue (y/n): ");
        String read = input.next().toLowerCase();
        char close = read.charAt(0);
        switch (close) {
            case 'y':
                exit = 'n';
                break;
            case 'n':
                exit = 'y';
                System.out.println("Good luck!");
                break;
            default:
                System.out.println("Wrong symbol!");
                exit = 'n';
                break;
        }
    }
}
