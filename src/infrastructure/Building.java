package infrastructure;

public class Building {

    private String owner = "CERN";
    private String location = "Geneva";

    public Building(String owner, String location) {
        this.owner = owner;
        this.location = location;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
