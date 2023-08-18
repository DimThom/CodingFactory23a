package gr.aueb.cf.testbed.ch14.tsk1;

/**
 * Αυτή η κλάση αναπαριστά έναν ιππότη του Αγίου Γεωργίου. Χρησιμοποιεί τον προτύπο
 * Singleton για να διασφαλίσει ότι υπάρχει μόνο ένα αντικείμενο αυτής της κλάσης.
 */
public class SaintGeorgeKnight {

    private static SaintGeorgeKnight instance;

    /**
     * Ιδιωτικός κατασκευαστής για τη δημιουργία του μοναδικού αντικειμένου της κλάσης.
     * Εδώ μπορεί να πραγματοποιηθεί η αρχικοποίηση που χρειάζεται για τον ιππότη.
     */
    private SaintGeorgeKnight() {
        // Εδώ μπορείτε να τοποθετήσετε αρχικοποίηση που χρειάζεται για τον ιππότη
    }

    /**
     * Επιστρέφει το μοναδικό αντικείμενο της κλάσης. Αν το αντικείμενο δεν έχει δημιουργηθεί ακόμη,
     * τότε δημιουργείται ένα νέο αντικείμενο χρησιμοποιώντας τον μηχανισμό του Singleton.
     *
     * @return Το μοναδικό αντικείμενο της κλάσης.
     */
    public static SaintGeorgeKnight getInstance() {
        if (instance == null) {
            synchronized (SaintGeorgeKnight.class) {
                if (instance == null) {
                    instance = new SaintGeorgeKnight();
                }
            }
        }
        return instance;
    }

    /**
     * Ξεκινά μια αποστολή για τον ιππότη του Αγίου Γεωργίου και εκτυπώνει ένα μήνυμα.
     */
    public void embarkOnMission() {
        System.out.println("The Saint George's knight is embarking on a mission!");
    }
}


