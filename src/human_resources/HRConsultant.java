package human_resources;

import infrastructure.IEmployee;

public class HRConsultant implements HumanResourcesDepartment {

    private IEmployee employee;

    public HRConsultant(IEmployee employee) {
        this.employee = employee;
    }

    public IEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(IEmployee employee) {
        this.employee = employee;
    }
}
