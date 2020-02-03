package infrastructure.security;

import human_resources.Visitor;

import java.util.ArrayList;
import java.util.Date;

public class VisitorIDCard extends IDCard {

    private Chip chip;
    private Visitor visitor;

    public VisitorIDCard(String id, Date validFrom, Date validUntil, int[][] irisStructure, ArrayList<Permission> permissionList, boolean isLocked, IEncryption encryption, Chip chip, Visitor visitor) {
        super(id, validFrom, validUntil, irisStructure, permissionList, isLocked, encryption);
        this.chip = chip;
        this.visitor = visitor;
    }

    public VisitorIDCard() {
        super();
    }

    public VisitorIDCard(int ids) {
        setId(String.valueOf(ids));
    }

    public Chip getChip() {
        return chip;
    }

    public void setChip(Chip chip) {
        this.chip = chip;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }
}
