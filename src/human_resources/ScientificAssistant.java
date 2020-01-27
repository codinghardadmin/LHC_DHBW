package human_resources;

import java.util.Date;

public class ScientificAssistant extends Employee {

    public ScientificAssistant(Date periodFrom, Date periodUntil, int id, String name, int[][] iris) {
        super(id, name, iris);
        this.periodFrom = periodFrom;
        this.periodUntil = periodUntil;
    }

    public void setPeriodFrom(Date periodFrom) {
        this.periodFrom = periodFrom;
    }

    public void setPeriodUntil(Date periodUntil) {
        this.periodUntil = periodUntil;
    }

    public Date getPeriodFrom() {
        return periodFrom;
    }

    public Date getPeriodUntil() {
        return periodUntil;
    }

    private Date periodFrom;
    private Date periodUntil;

}
