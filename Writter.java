/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

/**
 *
 * @author Helfi Apriliyandi F
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writter {
        public static void writeFile(String fileName, String content) {
        File directory = new File(fileName);
        String dirName = directory.getAbsolutePath();
        try {
            FileWriter writeFile = new FileWriter((dirName));
            writeFile.write(content);
            writeFile.close();
        } catch(IOException e) {
            System.out.println("Canot write file");
            e.printStackTrace();
        }
    }

}
