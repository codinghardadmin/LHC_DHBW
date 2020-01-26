package infrastructure;

import human_resources.Employee;
import infrastructure.security.NewEmployeeIDCard;

public enum SecurityCentre {
    instance;

    private IROEmployee employee;

    public NewEmployeeIDCard create(Employee employee) {

        return null;
    }
}
