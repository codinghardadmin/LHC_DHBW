package infrastructure.security;

public interface IEncryption {

    String encrypt(String text);
    String decrypt(String text);

}
