package appcrypt;

import java.security.SecureRandom;
import java.lang.String;
//import javax.crypto.Cipher;

 /*
  * Generate a password, a random value of all possible positions of index
  */
class GenString {
   
    private SecureRandom randomOut = new SecureRandom();
    private StringBuilder password = new StringBuilder(); 
    static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    static final String NUMBER = "0123456789";
    static final String SYMBOL = "!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?";
    static String ALL_CHARS = CHAR_LOWER + CHAR_UPPER + NUMBER + SYMBOL;

    protected String genString(byte lengtPass){
        //Build string
        for (byte i = 0; i < lengtPass; i++) {
            int randomIndex = randomOut.nextInt(ALL_CHARS.length());
            char randomChar = ALL_CHARS.charAt(randomIndex);
            password.append(randomChar);
        }
        return password.toString();
    }
}