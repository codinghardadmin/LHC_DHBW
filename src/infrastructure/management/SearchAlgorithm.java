package infrastructure.management;

public enum SearchAlgorithm {

    // Hier noch File.seperator anstatt /

    NATIVE("Native/jar", "Native"),
    BOYER_MOORE("BoyerMoore/jar", "BoyerMoore"),
    KNUTH_MORRIS_PRATT("KnuthMorrisPratt/jar", "KnuthMorrisPratt");

    private String name;
    private String path;

    SearchAlgorithm(String path, String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return path + name + ".jar";
    }

}
