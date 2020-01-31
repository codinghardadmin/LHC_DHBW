package infrastructure.security;

public enum Keystore {

    Key("KEYSTRING");

    private String key;

    Keystore(String key) {
        this.key = key;
    }

    public String getKeyString() {
        return key;
    }
}
