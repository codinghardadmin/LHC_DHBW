package infrastructure.management;

import infrastructure.security.IDCard;
import human_resources.Employee;

import java.util.HashMap;

public enum Management {

    instance;

    private HashMap<Integer, Employee> employeeMap;
    private HashMap<Integer, IDCard> idCardHashMap;

    public void createEmployee(String name, String type) {

    }

    public void assignIDCard(IDCard idCard, Employee employee) {

    }

    public void lockIDCard(IDCard idCard) {

    }

    public void clearIDCard(IDCard idCard) {

    }

}
