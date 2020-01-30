package lhc;

import com.google.common.eventbus.Subscribe;
import infrastructure.experiment.Experiment;
import infrastructure.management.Analyse;
import infrastructure.management.RunExperimentFull;
import infrastructure.management.RunExperimentPartial;

public class Ring {

    private boolean isActivated;
    private Experiment currentExperiment;
    private int energy;

    public void activate() {

    }

    public void activate(int initialEnergy) {

    }

    public void activateMagneticField() {

    }

    public void releaseProton() {

    }

    public void increaseEnergy(int delta) {

    }

    public void collide(Proton proton01, Proton proton02) {

    }

    public int decreaseEnergy() {
        return 0;
    }

    public void shutdown() {

    }

    @Subscribe
    public void receive(RunExperimentFull experimentFull) {

    }

    @Subscribe
    public void receive(RunExperimentPartial experimentPartial) {

    }

}
