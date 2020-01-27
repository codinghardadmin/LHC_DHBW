package infrastructure.management;

public enum ControlCenter {
    instance;

    public void create() {

    }

    private String roomID = "C01";

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }
}
