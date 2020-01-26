package lhc;

import infrastructure.IRODetector;
import infrastructure.experiment.Experiment;

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
}
