package human_resources;

public class ResearchGroup {

    private Researcher[] researcher = new Researcher[3];
    private ScientificAssistant[] scientificAssistant = new ScientificAssistant[2];

    public ResearchGroup(Researcher[] researcher, ScientificAssistant[] scientificAssistant) {
        this.researcher = researcher;
        this.scientificAssistant = scientificAssistant;
    }

    public Researcher[] getResearcher() {
        return researcher;
    }

    public void setResearcher(Researcher[] researcher) {
        this.researcher = researcher;
    }

    public ScientificAssistant[] getScientificAssistant() {
        return scientificAssistant;
    }

    public void setScientificAssistant(ScientificAssistant[] scientificAssistant) {
        this.scientificAssistant = scientificAssistant;
    }
}
