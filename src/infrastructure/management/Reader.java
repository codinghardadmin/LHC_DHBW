package infrastructure.management;

import human_resources.Employee;
import infrastructure.security.*;

public class Reader implements IReader {

    private String currentEmployeeIris;

    public String scanIris(Employee employee) {
        return "iris_data";
    }

    public boolean insertCard(VisitorIDCard idCard, ICardTechnology tech, String password) {
        return IDCardManagement.instance.checkPassword(idCard, password);
    }

    public boolean insertCard(NewEmployeeIDCard idCard, ICardTechnology tech, String password) {
        return IDCardManagement.instance.checkPassword(idCard, password);
    }

    public void removeCard() {
        System.out.println("Removed ID Card");
    }


    public void removeIDCard() {

    }

}
