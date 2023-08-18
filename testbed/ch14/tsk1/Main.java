package gr.aueb.cf.testbed.ch14.tsk1;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία ενός αντικειμένου της κλάσης SaintGeorgeKnight χρησιμοποιώντας τον Singleton μηχανισμό
        SaintGeorgeKnight knight = SaintGeorgeKnight.getInstance();

        // Ξεκίνηση μιας αποστολής για τον ιππότη του Αγίου Γεωργίου
        knight.embarkOnMission();
    }
}


