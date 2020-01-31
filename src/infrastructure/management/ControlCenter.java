package infrastructure.management;

import com.google.common.eventbus.EventBus;

import java.util.concurrent.Flow;

public enum ControlCenter {
    instance;

    private EventBus eventBus;
    private String roomID = "C01";

    ControlCenter() {
        eventBus = new EventBus("ControlCenter");
    }

    public void addSubscriber(Subscriber subscriber) {
        eventBus.register(subscriber);
    }

    public void startExperiment() {}

    public void startExperiment(ExperimentScope scope) {
        if (scope == ExperimentScope.ESFull) {
            eventBus.post(new RunExperimentFull());
            eventBus.post(new RunExperimentPartial());
            eventBus.post(new Analyse());
        } else if (scope == ExperimentScope.ES20) {

        } else if (scope == ExperimentScope.ES10) {

        } else if (scope == ExperimentScope.ES5) {

        }
    }

    public void create() {

    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }


}
