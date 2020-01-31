package infrastructure.security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

public class AESEncryption implements IEncryption {

    private SecretKeySpec secretKey;

    private void setKey(String inputKey) {
        byte[] key;
        MessageDigest messageDigest;
        try {
            key = inputKey.getBytes(StandardCharsets.UTF_8);
            messageDigest = MessageDigest.getInstance("SHA-1");
            key = messageDigest.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public String encrypt(String string, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(string.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return null;
    }

    public String decrypt(String string, String secret) {
        try {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(string)));
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return null;
    }

    @Override
    public String encrypt(String text) {
        return null;
    }

    @Override
    public String decrypt(String text) {
        return null;
    }
}
