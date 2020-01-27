package human_resources;

public abstract class Person {

    public Person(int id, String name, int[][] iris) {
        this.id = id;
        this.name = name;
        this.iris = iris;
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

    protected int id;
    protected String name;
    protected int[][] iris = new int[10][10];

}
