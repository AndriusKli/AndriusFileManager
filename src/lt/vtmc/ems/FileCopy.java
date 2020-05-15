package lt.vtmc.ems;

import java.io.*;

public class FileCopy {

    private String fileName;
    private String newFileName;

    public FileCopy(String fileName, String newFileName) {
        this.fileName = fileName;
        this.newFileName = newFileName;
    }

    public void copyByteByByte() {
        try (FileInputStream fis = new FileInputStream(fileName);
             FileOutputStream fos = new FileOutputStream(newFileName)){
            int dataBox;
            while ((dataBox = fis.read()) != -1){
                fos.flush();
                fos.write(dataBox);
            }
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }
}
