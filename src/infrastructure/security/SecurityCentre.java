package infrastructure.security;

import human_resources.Employee;
import human_resources.IROEmployee;

public enum SecurityCentre {
    instance;

    private IROEmployee employee;

    public NewEmployeeIDCard create(Employee employee) {

        return null;
    }

    public void lock(NewEmployeeIDCard newCard) {
        newCard.setLocked(true);
    }
}
