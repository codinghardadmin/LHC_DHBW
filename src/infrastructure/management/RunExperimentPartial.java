package infrastructure.management;

public class RunExperimentPartial {

    private ExperimentScope experimentScope;

    public RunExperimentPartial(ExperimentScope experimentScope) {
        this.experimentScope = experimentScope;
    }

    public ExperimentScope getExperimentScope() {
        return experimentScope;
    }

    public void setExperimentScope(ExperimentScope experimentScope) {
        this.experimentScope = experimentScope;
    }
}
