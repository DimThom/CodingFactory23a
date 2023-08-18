package gr.aueb.cf.testbed.ch12.bankApp.model;

import gr.aueb.cf.testbed.ch12.bankApp.exceptions.InsufficientFundsException;

/**
 * Αναπαριστά έναν τραπεζικό λογαριασμό που επιτρέπει ανάληψη ποσών
 * μεγαλύτερων από το υπόλοιπό του.
 */
public class OverdraftAccount extends Account {
    private double overdraftLimit;

    /**
     * Κατασκευαστής της κλάσης OverdraftAccount.
     *
     * @param accountNumber Ο αριθμός του λογαριασμού.
     * @param initialBalance Το αρχικό υπόλοιπο του λογαριασμού.
     * @param overdraftLimit Το όριο ανοχής υπεράντησης.
     */
    public OverdraftAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Αναλαμβάνει ανάληψη ενός ποσού από τον λογαριασμό.
     * Επιτρέπει την ανάληψη ποσών που υπερβαίνουν το υπόλοιπο, αλλά όχι πέρα από το όριο ανοχής υπεράντησης.
     *
     * @param amount Το ποσό που θα αναληφθεί.
     * @throws InsufficientFundsException Εάν το υπόλοιπο και το όριο ανοχής δεν επαρκούν για την ανάληψη του ποσού.
     */
    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (getBalance() + overdraftLimit >= amount) {
            super.withdraw(amount);
        } else {
            throw new InsufficientFundsException("Μη επαρκές υπόλοιπο και όριο ανοχής.");
        }
    }
}

