package infrastructure.management;

import human_resources.Employee;
import human_resources.Visitor;
import infrastructure.security.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public enum IDCardManagement {
    instance;

    private HashMap<Integer, IDCard> idCardHashMap;
    private static int ids = 1;
    private IrisScanner scanner;

    public VisitorIDCard createBlankIdCard() {
        ids++;
        VisitorIDCard idCard = new VisitorIDCard(ids);
        return idCard;
    }

    public VisitorIDCard create(VisitorIDCard idcard, Visitor visitor, String password) {
        Calendar calendar = Calendar.getInstance();

        Date today = calendar.getTime();
        calendar.add(Calendar.MONTH, 1);

        Date until = calendar.getTime();

        AESEncryption encryption = new AESEncryption();
        String encryptedPassword = encryption.encrypt(password);

        Chip chip1 = new Chip(encryptedPassword);

        int[][] iris = scanner.scanIris();

        idcard.setChip(chip1);
        idcard.setEncryption(encryption);
        idcard.setValidFrom(today);
        idcard.setValidUntil(until);

        idcard.setIrisStructure(iris);

        return idcard;
    }

    public NewEmployeeIDCard create(Employee employee) {
        final String password = "helloLHC2020";

        Calendar calendar = Calendar.getInstance();

        Date today = calendar.getTime();
        calendar.add(Calendar.MONTH, 6);

        Date until = calendar.getTime();

        AESEncryption encryption = new AESEncryption();
        String encryptedPassword = encryption.encrypt(password);

        Chip chip1 = new Chip(encryptedPassword);
        Chip chip2 = new Chip(encryptedPassword);

        ids++;

        int[][] iris = scanner.scanIris();

        NewEmployeeIDCard idCard = new NewEmployeeIDCard(String.valueOf(ids), today, until, iris, new ArrayList<Permission>(),
                false, encryption, chip1, chip2);

        return idCard;
    }

    public boolean checkPassword(VisitorIDCard card, String password) {
        if (new AESEncryption().encrypt(password).equals(card.getChip().getPassword())) {
            return true;
        }
        return false;
    }

    public boolean checkPassword(NewEmployeeIDCard card, String password) {
        if (new AESEncryption().encrypt(password).equals(card.getChip1().getPassword())) {
            return true;
        }
        return false;
    }

    public void lock(IDCard idcard) {
        idcard.setLocked(true);
    }

    public void clearIDCard(IDCard idCard) {
        idCard.setLocked(false);
    }

}
