package infrastructure.security;

public enum MasterPasswordConfiguration {

    AESmasterPassword("%DEFAULTPASSWORD%");

    private String defaultPassword;

    MasterPasswordConfiguration(String str) {}
}
