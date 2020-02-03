package human_resources;

public class HRAssistant extends Employee {

    private IROEmployee employee;

    public HRAssistant(String name) {
        super(50, name, new int[10][10]);
    }

    public IROEmployee readEmployee() {
        return employee;
    }

    public void setEmployeeToRead(Employee employee) {

    }
}
