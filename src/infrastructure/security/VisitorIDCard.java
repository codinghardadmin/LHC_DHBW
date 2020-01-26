package infrastructure.security;

public class VisitorIDCard extends IDCard {

    private Chip chip;

    public VisitorIDCard(String password) {
        this.encryption = new AESEncryption();
        this.chip = new Chip(this.encryption.encrypt(password));
    }

}
