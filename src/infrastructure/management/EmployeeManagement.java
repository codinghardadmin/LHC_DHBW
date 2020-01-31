package infrastructure.management;

import human_resources.Employee;
import infrastructure.security.IDCard;

import java.util.HashMap;

public enum EmployeeManagement {
    instance;

    private HashMap<Integer, Employee> employeeMap;

    public void createEmployee(String name, String type) {

    }

    public void assignIDCard(IDCard idCard, Employee employee) {
        employee.setIdcard(idCard);
    }
}
