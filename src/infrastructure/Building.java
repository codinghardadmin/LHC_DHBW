package infrastructure;

import lhc.LargeHadronCollider;

public class Building {

    private String owner = "CERN";
    private String location = "Geneva";
    private LargeHadronCollider lhc;

    public Building(LargeHadronCollider lhc) {
        this.lhc = lhc;
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
