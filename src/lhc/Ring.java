package lhc;

import com.google.common.eventbus.Subscribe;
import infrastructure.experiment.Experiment;
import infrastructure.management.*;

public class Ring extends Subscriber {

    private boolean isActivated;
    private Experiment currentExperiment;
    private int energy;
    private ProtonTrap[] protonTraps = new ProtonTrap[2];
    private Detector detector;

    private Magnet[] magnets = new Magnet[72];

    public Ring(ProtonTrap[] protonTraps, Detector detector) {
        for (int i = 0; i < magnets.length; i++) {
            magnets[i] = new Magnet();
        }

        this.protonTraps = protonTraps;
        this.detector = detector;
    }

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
    public void receive(RunExperimentPartial experimentPartial, ExperimentScope scope) {
        int number = 0;
        if (scope == ExperimentScope.ES5) {
            number = 5;
        } else if (scope == ExperimentScope.ES10) {
            number = 10;
        } else if (scope == ExperimentScope.ES20) {
            number = 20;
        }
    }

}
