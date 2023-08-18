package gr.aueb.cf.testbed.ch12.bankApp.model;

import gr.aueb.cf.testbed.ch12.bankApp.exceptions.InsufficientFundsException;

/**
 * Η βασική κλάση που αναπαριστά έναν τραπεζικό λογαριασμό.
 */
public class Account {
    private String accountNumber;
    private double balance;

    /**
     * Κατασκευαστής της κλάσης Account.
     *
     * @param accountNumber Ο αριθμός του λογαριασμού.
     * @param initialBalance Το αρχικό υπόλοιπο του λογαριασμού.
     */
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    /**
     * Επιστρέφει τον αριθμό του λογαριασμού.
     *
     * @return Ο αριθμός του λογαριασμού.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Επιστρέφει το υπόλοιπο του λογαριασμού.
     *
     * @return Το υπόλοιπο του λογαριασμού.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Καταθέτει ένα ποσό στον λογαριασμό.
     *
     * @param amount Το ποσό που θα κατατεθεί.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Αναλαμβάνει ανάληψη ενός ποσού από τον λογαριασμό.
     *
     * @param amount Το ποσό που θα αναληφθεί.
     * @throws InsufficientFundsException Εάν το υπόλοιπο δεν επαρκεί για την ανάληψη του ποσού.
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InsufficientFundsException("Μη επαρκές υπόλοιπο.");
        }
    }
}
