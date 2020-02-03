package infrastructure.management;

import human_resources.Employee;
import infrastructure.security.IDCard;

import java.util.HashMap;

public enum EmployeeManagement {
    instance;

    private HashMap<Integer, Employee> employeeMap;

    public void createEmployee(String name, String type) {
        switch (type) {
            case "SECURITY_OFFICER":
                System.out.println("Created Security Officer");
                break;

            case "RESEARCHER":
                System.out.println("Created Researcher");
                break;

            case "SCIENTIFIC_ASSISTANT":
                System.out.println("Created Scientific Assistant");
                break;


            default:
                System.out.println("Failed creating Employee");
        }
    }

    public void assignIDCard(IDCard idCard, Employee employee) {
        employee.setIdcard(idCard);
    }
}
