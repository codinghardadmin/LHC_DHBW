package human_resources;

public class HRHoD implements HumanResourcesDepartment {

    private IEmployee employee;

    public HRHoD(IEmployee employee) {
        this.employee = employee;
    }

    public IEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(IEmployee employee) {
        this.employee = employee;
    }
}
