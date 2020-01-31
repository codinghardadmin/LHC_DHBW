package human_resources;

import infrastructure.security.IDCard;

public abstract class Employee extends Person {

    protected boolean isManager;
    protected boolean isMentor;
    protected boolean hasBudgetResponsibility;

    private IDCard idcard;

    public Employee(int id, String name, int[][] iris) {
        super(id, name, iris);
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public void setMentor(boolean mentor) {
        isMentor = mentor;
    }

    public void setHasBudgetResponsibility(boolean hasBudgetResponsibility) {
        this.hasBudgetResponsibility = hasBudgetResponsibility;
    }

    public boolean isManager() {
        return isManager;
    }

    public boolean isMentor() {
        return isMentor;
    }

    public boolean isHasBudgetResponsibility() {
        return hasBudgetResponsibility;
    }
}
