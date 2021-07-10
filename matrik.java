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
public class matrik {
     public static final String keyPair = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890`~!@#$%^&amp;*()_-+={}[]|\\:;’&lt;&gt;,.?/ \n\t";
    public static final String zeroKeyCode = "F";
    public static final String randomKey[] ={"A", "B", "C", "D", "E"};
    public static final Integer encryptKeyPair[][] = {
            {2,3},
            {1,2}
    };
    public static final Integer decryptKeyPair[][] = {
            {2, -3},
            {-1, 2}
    };

}
