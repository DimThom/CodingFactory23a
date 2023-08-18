package gr.aueb.cf.testbed.ch12.bankApp.model;

/**
 * Αναπαριστά έναν τραπεζικό λογαριασμό με δύο κατόχους.
 */
public class JointAccount {
    private Account holder1;
    private Account holder2;

    /**
     * Κατασκευαστής της κλάσης JointAccount.
     *
     * @param holder1 Ο πρώτος κάτοχος του λογαριασμού.
     * @param holder2 Ο δεύτερος κάτοχος του λογαριασμού.
     */
    public JointAccount(Account holder1, Account holder2) {
        this.holder1 = holder1;
        this.holder2 = holder2;
    }

    /**
     * Επιστρέφει τον πρώτο κάτοχο του λογαριασμού.
     *
     * @return Ο πρώτος κάτοχος του λογαριασμού.
     */
    public Account getHolder1() {
        return holder1;
    }

    /**
     * Επιστρέφει τον δεύτερο κάτοχο του λογαριασμού.
     *
     * @return Ο δεύτερος κάτοχος του λογαριασμού.
     */
    public Account getHolder2() {
        return holder2;
    }
}

