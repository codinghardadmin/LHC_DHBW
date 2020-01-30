package lhc;

import com.google.common.eventbus.Subscribe;
import infrastructure.experiment.Experiment;
import infrastructure.management.Analyse;

import java.io.Reader;
import java.util.LinkedList;

public class Detector implements IRODetector {

    private static String higgsBosonStructure = "higgs";
    private boolean isActivated;
    private LinkedList<Experiment> experimentList;
    private Reader reader;

    @Override
    public LinkedList<Experiment> getExperimentList() {
        return this.experimentList;
    }

    @Subscribe
    public void receive(Analyse analyse) {

    }
}
