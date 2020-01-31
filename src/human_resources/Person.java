package human_resources;

import infrastructure.security.IDCard;

public abstract class Person {

    protected int id;
    protected String name;
    protected int[][] iris;

    private IDCard idcard;

    public Person(int id, String name, int[][] iris) {
        this.id = id;
        this.name = name;
        this.iris = iris;
    }

    public IDCard getIdcard() {
        return idcard;
    }

    public void setIdcard(IDCard idcard) {
        this.idcard = idcard;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIris(int[][] iris) {
        this.iris = iris;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[][] getIris() {
        return iris;
    }

}
