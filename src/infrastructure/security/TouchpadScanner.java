package infrastructure.security;

public class TouchpadScanner implements IDataScanner {

    private String enteredPassword = "";

    @Override
    public String scan() {
        return null;
    }

    public void setEnteredPassword(String enteredPassword) {
        this.enteredPassword = enteredPassword;
    }

    public String getEnteredPassword() {
        return enteredPassword;
    }
}
