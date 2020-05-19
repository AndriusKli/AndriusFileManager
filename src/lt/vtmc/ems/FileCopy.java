package lt.vtmc.ems;

import java.io.*;

public class FileCopy {

    public FileCopy() {
    }

    public static void copyByteByByte(String fileName, String newFileName) {
        if (fileName.equals(newFileName)) {
            System.out.println("Can't create a file with the same name as the original.");
        } else {
            try (FileInputStream fis = new FileInputStream(fileName);
                 FileOutputStream fos = new FileOutputStream(newFileName)) {
                int dataBox;
                while ((dataBox = fis.read()) != -1) {
                    fos.flush();
                    fos.write(dataBox);
                }
            } catch (IOException ex) {
                System.out.println("Error " + ex);
            }
        }
    }
}
