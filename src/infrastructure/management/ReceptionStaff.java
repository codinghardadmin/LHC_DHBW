package infrastructure.management;

import human_resources.Employee;
import human_resources.Visitor;
import infrastructure.security.*;

import java.util.ArrayList;
import java.util.Date;

public class ReceptionStaff extends Employee {
    public ReceptionStaff() {
        super(10, "Staff", new int[10][10]);
    }

    public VisitorIDCard create(VisitorIDCard idcard, Visitor visitor, String password) {
        VisitorIDCard createdCard = IDCardManagement.instance.create(idcard, visitor, password);
        return createdCard;
    }

    public VisitorIDCard createBlankCard() {
        VisitorIDCard card = (VisitorIDCard) IDCardManagement.instance.createBlankIdCard();
        return card;
    }

    public void lock(IDCard idcard) {
        idcard.setLocked(true);
    }
}
