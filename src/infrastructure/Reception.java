package infrastructure;

import human_resources.Visitor;
import infrastructure.security.IDCard;
import infrastructure.security.VisitorIDCard;

import java.util.Map;

public enum Reception {
    instance;

    private Map<Visitor, IDCard> visitorList;

    public VisitorIDCard create(Visitor visitor) {
        VisitorIDCard idCard = new VisitorIDCard();
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
