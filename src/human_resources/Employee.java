package human_resources;

import infrastructure.security.IDCard;

public abstract class Employee extends Person implements IROEmployee {

    protected boolean isManager = false;
    protected boolean isMentor = false;
    protected boolean hasBudgetResponsibility = false;

    private IDCard idcard;

    public Employee(int id, String name, int[][] iris) {
        super(id, name, iris);
        this.isManager = false;
        this.isMentor = false;
        this.hasBudgetResponsibility = false;
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
