package infrastructure.security;

import infrastructure.IEncryption;

import java.util.ArrayList;
import java.util.Date;

public class NewEmployeeIDCard extends IDCard {

    private Chip chip1;
    private Chip chip2;

    public NewEmployeeIDCard(String id, Date validFrom, Date validUntil, int[][] irisStructure, ArrayList<Permission> permissionList, boolean isLocked, IEncryption encryption, Chip chip1, Chip chip2) {
        super(id, validFrom, validUntil, irisStructure, permissionList, isLocked, encryption);
        this.chip1 = chip1;
        this.chip2 = chip2;
    }
}
