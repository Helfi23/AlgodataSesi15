/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hillchiper;

/**
 *
 * @author Helfi Apriliyandi F
 */
import hillchiper.deskripsi;
import hillchiper.enkripsi;
import IO.Reader;
import IO.Writter;

public class main {
        public static void main(String[] args) {
        // read file
        String readedFile = Reader.readFile("src/Custom.txt");
        System.out.println("" + readedFile);
        // encrypt file
        String encryptedText = enkripsi.encrypt(readedFile);
        System.out.println("" + encryptedText);
        // write encrypted file
        Writter.writeFile("src/hasil enkripsi.txt", encryptedText);
        // read encrypted file
        String encryptedFile = Reader.readFile("src/hasil enkripsi.txt");
        // decrupt file
        String decryptedFile = deskripsi.decrypt(encryptedFile);
        System.out.println("" + decryptedFile);
        // write decrypted file
        Writter.writeFile("src/hasil deskripsi.txt", decryptedFile);
    }

}
