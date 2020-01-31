package infrastructure.energy;

public class USP {

    private boolean isStandBy;
    private boolean isActivated;
    private Battery[] batteries = new Battery[25];

    public USP(boolean isStandBy, boolean isActivated, Battery[] batteries) {
        this.isStandBy = isStandBy;
        this.isActivated = isActivated;
        this.batteries = batteries;
    }

    public void determineChargeState() {

    }

    public void charge(ThreePinPlug plug) {

    }

    public int takeOut() {
        return 0;
    }

}
