package application;

import human_resources.Visitor;
import infrastructure.management.Reception;
import infrastructure.security.VisitorIDCard;

public class Application {
    public static void main(String[] args) {
        /*
        // Erstellung einer ID-Karte für Besucher durch die Rezeption
        Visitor visitor = new Visitor(0, "Name", new int[10][10]);
        VisitorIDCard card = Reception.instance.create(visitor, null, null, null, null, null, false, null, null, null);

        // Erstellung einer ID-Karte für Mitarbeiter durch Security
        Employee employee;
        employee = new SecurityOfficer(false, 1, null, new int[10][10]);
        NewEmployeeIDCard newCard = SecurityCentre.instance.create(employee);

        // Reader prüft Zutritt für einen Besucher
        String enteredPassword1 = "test";
        IReader reader1 = new CardReader();

        // Reader prüft Zutritt für einen Mitarbeiter
        String enteredPassword2 = "test";
        IReader reader2 = new CardReader();

        // Forscher greift lesend auf die im Detektor gespeicherten Experimente zu
        Detector detector = new Detector();
        Employee researcher = new Researcher(false, detector, 2, null, new int[10][10]);

        // HRAssistant hat lesenden Zugriff auf die Daten der Mitarbeiter
        HumanResourcesDepartment hrassistant = new HRAssistant(null);

        // Security Centre sperrt eine ID-Karte
        SecurityCentre.instance.lock(newCard);
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

        // Erstellung einer ID-Karte für Besucher durch die Rezeption
        Visitor visitor = new Visitor(0, "Name", new int[10][10]);
        VisitorIDCard card = Reception.instance.create(visitor, null, null, null, null, null, false, null, null, null);

    }
}
