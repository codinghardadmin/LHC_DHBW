package application;

import infrastructure.management.SearchAlgorithm;
import infrastructure.security.Keystore;

public class Configuration {

    public static final SearchAlgorithm searchAlgorithm = SearchAlgorithm.NATIVE;
    public static final String key = Keystore.Key.getKeyString();

}
