package infrastructure.security;

import human_resources.Employee;
import human_resources.IROEmployee;
import infrastructure.management.SecurityStaff;

public enum SecurityCentre {
    instance;

    private IROEmployee employee;
    private SecurityStaff staff = new SecurityStaff();

    public SecurityStaff getSecurityStaff() {
        return this.staff;
    }

    public void setSecurityStaff(SecurityStaff staff) {
        this.staff = staff;
    }
}
