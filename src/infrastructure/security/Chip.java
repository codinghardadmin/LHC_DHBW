package infrastructure.security;

public class Chip {

    private String password;

    public Chip(String password) {
        this.password = password;
    }

    void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

}
