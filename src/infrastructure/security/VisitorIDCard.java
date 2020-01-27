package infrastructure.security;

import human_resources.Visitor;

import java.util.ArrayList;
import java.util.Date;

public class VisitorIDCard extends IDCard {

    private Chip chip;
    private Visitor visitor;

    public VisitorIDCard(String id, Date validFrom, Date validUntil, int[][] irisStructure, ArrayList<Permission> permissionList, boolean isLocked, IEncryption encryption, Chip chip, String password, Visitor visitor) {
        super(id, validFrom, validUntil, irisStructure, permissionList, isLocked, encryption);
        this.visitor = visitor;
        this.chip = chip;
        this.encryption = new AESEncryption();
        this.chip = new Chip(this.encryption.encrypt(password));
    }
}
