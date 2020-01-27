package human_resources;

import infrastructure.IRODetector;

public class Researcher extends Employee {

    public Researcher(boolean isSenior, IRODetector detector) {
        this.isSenior = isSenior;
        this.detector = detector;
    }

    private boolean isSenior;
    private IRODetector detector;

    public void setSenior(boolean senior) {
        isSenior = senior;
    }

    public void setDetector(IRODetector detector) {
        this.detector = detector;
    }

    public IRODetector getDetector() {
        return detector;
    }

    public boolean isSenior() {
        return isSenior;
    }
}
