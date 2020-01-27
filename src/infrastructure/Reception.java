package infrastructure;

import human_resources.Visitor;
import infrastructure.security.Chip;
import infrastructure.security.IDCard;
import infrastructure.security.Permission;
import infrastructure.security.VisitorIDCard;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public enum Reception {
    instance;

    private Map<Visitor, IDCard> visitorList;

    public VisitorIDCard create(Visitor visitor, String id, Date validFrom, Date validUntil, int[][] irisStructure, ArrayList<Permission> permissionList, boolean isLocked, IEncryption encryption, Chip chip, String password) {
        VisitorIDCard idCard = new VisitorIDCard(id, validFrom, validUntil, irisStructure, permissionList, isLocked, encryption, chip, password, visitor);
        visitorList.put(visitor, idCard);
        return idCard;
    }

    public void lock(Visitor visitor) {
        IDCard card = visitorList.get(visitor);
        card.setLocked(true);
    }

    public void lock(IDCard idcard) {
        idcard.setLocked(true);
    }
}
