package infrastructure.management;

import human_resources.Employee;
import infrastructure.security.IDCard;
import infrastructure.security.NewEmployeeIDCard;

public class SecurityStaff {

    public void lock(IDCard idcard) {
        idcard.setLocked(true);
    }

    public NewEmployeeIDCard create(Employee employee) {
        return IDCardManagement.instance.create(employee);
    }
}
