package neo.javautils;

import java.security.MessageDigest;

public class EncryptHelper {
    final public static char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String md5(String s) {
        int i = 0;
        char[] ret = new char[32];

        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"));

            for (byte b : digest) {
                ret[i++] = hexChar[b >>> 4 & 0xF];
                ret[i++] = hexChar[b & 0xF];
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return new String(ret);
    }
}
