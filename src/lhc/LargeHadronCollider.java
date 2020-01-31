package lhc;

import infrastructure.energy.USP;

public class LargeHadronCollider {

    private Ring ring;
    private USP usp;

    public LargeHadronCollider(Ring ring, USP usp) {
        this.ring = ring;
        this.usp = usp;
    }

    public Ring getRing() {
        return ring;
    }

    public void setRing(Ring ring) {
        this.ring = ring;
    }

    public USP getUsp() {
        return usp;
    }

    public void setUsp(USP usp) {
        this.usp = usp;
    }
}
