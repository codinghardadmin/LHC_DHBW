package human_resources;

import java.util.ArrayList;
import java.util.List;

public class HumanResourcesDepartment {

    private List<Employee> employees = new ArrayList<Employee>();
    
    public HumanResourcesDepartment(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
