package infrastructure.management;

import infrastructure.security.ICardTechnology;

public class TouchpadReader implements IReader {

    private ICardTechnology technology;

    public TouchpadReader() {

    }

    @Override
    public String read() {
        return null;
    }
}
