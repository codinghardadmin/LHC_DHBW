package infrastructure;

public interface IEncryption {

    String encrypt(String text);
    String decrypt(String text);

}
