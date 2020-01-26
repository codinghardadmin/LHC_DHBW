package infrastructure;

import human_resources.Visitor;
import infrastructure.security.IDCard;
import infrastructure.security.VisitorIDCard;

import java.util.Map;

public enum Reception {
    instance;

    private Map<Visitor, IDCard> visitorList;

    public VisitorIDCard create(Visitor visitor) {
        visitorList.put(visitor, new VisitorIDCard());
        return null;
    }

    public void lock(Visitor visitor) {
        visitorList.get(visitor)
    }
}
