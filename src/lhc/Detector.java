package lhc;

import application.Configuration;
import com.google.common.eventbus.Subscribe;
import infrastructure.experiment.Experiment;
import infrastructure.management.Analyse;
import infrastructure.management.Subscriber;

import java.io.File;
import java.io.Reader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.LinkedList;

public class Detector extends Subscriber implements IRODetector {

    private static String higgsBosonStructure = "higgs";
    private boolean isActivated;
    private LinkedList<Experiment> experimentList = new LinkedList<>();
    private Reader reader;

    @Override
    public LinkedList<Experiment> getExperimentList() {
        return this.experimentList;
    }

    @Subscribe
    public void receive(Analyse analyse) {

    }

    public void search(Experiment experiment) {
        // Welcher String?
        String searchString = experiment.toString();

        Class<?> clazz = null;
        Object instance = null;
        Object port = null;


        // Beispiel mit MemoryStick
        /*String fileSeparator = System.getProperty("file.separator");
        String userDirectory = System.getProperty("user.dir");
        String typeOfMemoryStick = "02";
        String nameOfSubFolder = "exchange_component_" + typeOfMemoryStick + fileSeparator + "jar";
        String nameOfJavaArchive = "MemoryStick.jar";
        String subFolderPathOfJavaArchive = nameOfSubFolder + fileSeparator + nameOfJavaArchive;
        String fullPathToJavaArchive = userDirectory + subFolderPathOfJavaArchive;
        String nameOfClass = "MemoryStick";*/

        String nameOfClass = Configuration.searchAlgorithm.getName();
        String subFolderPathOfJavaArchive = Configuration.searchAlgorithm.getPath();

        System.out.println("--- SearchConfiguration");
        System.out.println("subFolderPathOfJavaArchive : " + subFolderPathOfJavaArchive);
        System.out.println("nameOfClass                : " + nameOfClass);
        System.out.println();


        System.out.println("--- loadClazzFromJavaArchive");
        try {
            URL[] urls = {new File(subFolderPathOfJavaArchive).toURI().toURL()};
            URLClassLoader urlClassLoader = new URLClassLoader(urls, Detector.class.getClassLoader());
            clazz = Class.forName(nameOfClass, true, urlClassLoader);
            System.out.println("class    : " + clazz.toString() + " - " + clazz.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("--- provideInstanceOfClass");
        try {
            instance = clazz.getMethod("getInstance").invoke(null);
            System.out.println("instance : " + instance.toString() + " - " + instance.hashCode());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("--- provideComponentPort");
        try {
            port = clazz.getDeclaredField("port").get(instance);
            System.out.println("port     : " + port.toString() + " - " + port.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }


        boolean success = false;
        int result = -1;
        System.out.println("--- executeSearchMethodUsingPort");
        try {
            Method method = port.getClass().getMethod("search", String.class, String.class);
            System.out.println(method);

            result = (int) method.invoke(port, searchString, higgsBosonStructure);
            success = true;
            System.out.println("result   : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (success) {
            System.out.println("Success! Result: " + result);
        }
    }
}
