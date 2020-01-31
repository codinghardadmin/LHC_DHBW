package infrastructure;

import human_resources.ResearchGroup;

public class Workplace {

    private ResearchGroup researchGroup;

    public Workplace(ResearchGroup researchGroup) {
        this.researchGroup = researchGroup;
    }

    public ResearchGroup getResearchGroup() {
        return researchGroup;
    }

    public void setResearchGroup(ResearchGroup researchGroup) {
        this.researchGroup = researchGroup;
    }
}
