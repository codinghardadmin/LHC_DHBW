package infrastructure.security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class MD5Encryption implements IEncryption {

    public String encrypt(String string, String secret) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bytes = string.getBytes("UTF-8");
        MessageDigest sha = MessageDigest.getInstance("MD5");
        bytes = sha.digest(bytes);
        String encryptedPassword = new String(bytes);
        return encryptedPassword;
    }

    public String decrypt(String string, String secret) {
       throw new RuntimeException("Decrypt not available with MD5");
    }

    @Override
    public String encrypt(String text) {
        return "";
    }

    @Override
    public String decrypt(String text) {
        return "";
    }
}
