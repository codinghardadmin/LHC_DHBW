package application;

import human_resources.*;
import infrastructure.experiment.Experiment;
import infrastructure.management.*;
import infrastructure.security.*;
import lhc.Detector;
import lhc.ProtonTrap;
import lhc.Ring;

import java.io.IOException;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) throws IOException {

        // Erstellung einer ID-Karte für Besucher durch die Rezeption
        Visitor visitor = new Visitor(0, "Visitor", new IrisScanner().scanIris());
        VisitorIDCard card = Reception.instance.getReceptionStaff().createBlankCard();
        TouchpadScanner reader = new TouchpadScanner();
        reader.setEnteredPassword("123456"); // Hier wird das Passwort eingegeben (simuliert)
        String enteredPW = reader.getEnteredPassword();
        Reception.instance.getReceptionStaff().create(card, visitor, enteredPW);
        System.out.println("VisitorCard: " + card.toString());


        // Erstellung einer ID-Karte für Mitarbeiter durch Security
        Employee employee;
        employee = new SecurityOfficer(false, 1, "Officer 1", new IrisScanner().scanIris());
        NewEmployeeIDCard newCard = SecurityCentre.instance.getSecurityStaff().create(employee);
        System.out.println("EmployeeCard: " + newCard.toString());


        // Reader prüft Zutritt für einen Besucher
        String enteredPassword1 = "test";
        TouchpadScanner scanner1 = new TouchpadScanner();
        scanner1.setEnteredPassword(enteredPassword1); // Hier wird das Passwort eingegeben (simuliert)
        String enteredPW1 = scanner1.getEnteredPassword();
        Reader reader1 = new Reader();
        boolean access = reader1.insertCard(card, new Slot(), enteredPassword1);
        System.out.println("Zutritt Besucher: " + access);


        // Reader prüft Zutritt für einen Mitarbeiter
        String enteredPassword2 = "test";
        TouchpadScanner scanner2 = new TouchpadScanner();
        scanner2.setEnteredPassword(enteredPassword2); // Hier wird das Passwort eingegeben (simuliert)
        String enteredPW2 = scanner2.getEnteredPassword();
        Reader reader2 = new Reader();
        boolean access2 = reader2.insertCard(card, new RFID(), enteredPassword2);
        System.out.println("Zutritt Mitarbeiter: " + access2);


        // Forscher greift lesend auf die im Detektor gespeicherten Experimente zu
        Detector detector = new Detector();
        Researcher researcher = new Researcher(false, detector, 2, null, new int[10][10]);
        LinkedList<Experiment> experimentList = researcher.getDetector().getExperimentList();
        System.out.println("ExperimentListSize: " + experimentList.size());


        // HRAssistant hat lesenden Zugriff auf die Daten der Mitarbeiter
        HRAssistant assistant = new HRAssistant("Assistant");
        assistant.setEmployeeToRead(employee);
        IROEmployee readOnlyEmployee = assistant.readEmployee();
        System.out.print("isHasBudgetResponsibility: ");
        System.out.println(readOnlyEmployee.isHasBudgetResponsibility());
        System.out.print("isManager: ");
        System.out.println(readOnlyEmployee.isManager());
        System.out.print("isMentor: ");
        System.out.println(readOnlyEmployee.isMentor());


        // Security Centre sperrt eine ID-Karte
        SecurityCentre.instance.getSecurityStaff().lock(newCard);
        boolean isLocked = newCard.isLocked();
        System.out.println("isLocked: " + isLocked);


        // WEITERE TESTS
        // WEITERE TESTS
        // WEITERE TESTS


        // Testen der SuchAlgorithmen (in Configuration ändern)
        // Starten des LHC und Analyse
        Detector collDetector = new Detector();
        ProtonTrap[] traps = new ProtonTrap[2];
        Ring ring = new Ring(traps, collDetector);

        ControlCenter.instance.startExperiment(ExperimentScope.ESFull);

        System.out.println("Started Experiment");



        /**
         *
         * UNWICHTIG
         * UNWICHTIG
         * UNWICHTIG
         *
         */

        /*
        (i)
        Die Reception erstellt die ID-Karten für die Besucher.

        (ii)
        Ein Security Centre ist verantwortlich für die Verwaltung
        (Erstellung und Sperrung)der ID-Karten der Mitarbeiter.
        Das Security Centre hat lesenden Zugriff auf die Datender Mitarbeiter.

        (iii)
        Das Passwort der ID-Karte für Besucher wird mit AES verschlüsselt.

        (iv)
        Aufgrund steigender Sicherheitsanforderungen werden für die Mitarbeiter
        neue ID-Karten eingeführt. Die ID-Karte hat zwei Chips - realisiert
        als Kompositionsstruktur. Auf dem ersten Chip ist der Fingerabdruck
        als MD5-Hash des Namens gespeichert. Auf dem zweiten Chip ist das
        Passwort - mit AES verschlüsselt - gespeichert.

        (v)
        Die beiden Typen von ID-Karten unterstützen zusätzlich RFID. Über
        eine Schnittstelle werden von der
        ID-Karte die Daten über RFID an den Reader übertragen.

        (vi)
        Das zentrale masterPassword für die AES-Verschlüsselung ist in einer
        zentralen Configuration - realisiert als Enumeration - gespeichert.

        (vii)
        Es wird eine neue Generation der Reader mit Touchpad eingesetzt.
        Für das Einlesen stehen die Varianten (i) Slot oder (ii) RFID zur
        Verfügung.Der Reader ermöglicht die Verifikation der ID-Karte.
        Der Mitarbeiter kann sein Passwortändern. Hierzu ist die Eingabe
        des vorherigen Passworts notwendig.Für den Abgleich der IRIS nutzt
        der Reader einen dedizierten Scanner.Der Reader unterstützt beide
        Typen von ID-Karten.

        (viii)
        Die Forscher sollen lesenden Zugriff (Schnittstelle) auf die im
        Detektor gespeicherten Ergebnisse der Experimente erhalten.

        (ix)
        Die Verwaltung der Mitarbeiter und ID-Karten wird aus Aspekten der SoD
        getrennt.Das EmployeeManagement und IDCardManagement wird als Enumeration
        realisiert.

        (x)
        Die Abteilung Human Resources Department organisiert sich bezüglich
        der Rollen neu. Die neuen Rollen sind HRHoD, HRConsultant und HRAssistant.
        Die Rollen HRHOD und HRConsultant haben schreibenden, der HRAssistant
        lesenden Zugriff aufdie Daten der Mitarbeiter.
         */
    }
}
