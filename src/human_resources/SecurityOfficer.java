package human_resources;

public class SecurityOfficer extends Employee {

    private boolean hasWeapon;

    public SecurityOfficer(boolean hasWeapon, int id, String name, int[][] iris) {
        super(id, name, iris);
        this.hasWeapon = hasWeapon;
    }

    public void setHasWeapon(boolean hasWeapon) {
        this.hasWeapon = hasWeapon;
    }

    public boolean isHasWeapon() {
        return hasWeapon;
    }
}
