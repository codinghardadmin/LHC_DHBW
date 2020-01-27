package human_resources;

public class HRAssistant implements HumanResourcesDepartment {

    private IROEmployee employee;

    public HRAssistant(IROEmployee employee) {
        this.employee = employee;
    }

    public IROEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(IROEmployee employee) {
        this.employee = employee;
    }
}
