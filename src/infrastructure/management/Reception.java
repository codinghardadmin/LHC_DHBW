package infrastructure.management;

import human_resources.Employee;
import human_resources.Visitor;
import infrastructure.security.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public enum Reception {
    instance;

    private Map<Visitor, IDCard> visitorList = new HashMap<Visitor, IDCard>();
    private ReceptionStaff receptionStaff = new ReceptionStaff();

    public ReceptionStaff getReceptionStaff() {
        return receptionStaff;
    }

    public void setReceptionStaff(ReceptionStaff receptionStaff) {
        this.receptionStaff = receptionStaff;
    }
}
