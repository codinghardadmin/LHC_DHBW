package infrastructure.security;

import infrastructure.IEncryption;

import java.util.ArrayList;
import java.util.Date;

public class VisitorIDCard extends IDCard {

    private Chip chip;

    public VisitorIDCard(String id, Date validFrom, Date validUntil, int[][] irisStructure, ArrayList<Permission> permissionList, boolean isLocked, IEncryption encryption, Chip chip, String password) {
        super(id, validFrom, validUntil, irisStructure, permissionList, isLocked, encryption);
        this.chip = chip;
        this.encryption = new AESEncryption();
        this.chip = new Chip(this.encryption.encrypt(password));
    }
}
