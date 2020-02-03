package infrastructure.security;

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

    public Chip getChip1() {
        return chip1;
    }

    public void setChip1(Chip chip1) {
        this.chip1 = chip1;
    }

    public Chip getChip2() {
        return chip2;
    }

    public void setChip2(Chip chip2) {
        this.chip2 = chip2;
    }
}
