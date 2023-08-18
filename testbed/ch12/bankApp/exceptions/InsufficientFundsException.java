package gr.aueb.cf.testbed.ch12.bankApp.exceptions;

/**
 * Εξαίρεση που ρίχνεται όταν το υπόλοιπο ενός λογαριασμού δεν επαρκεί για μια συγκεκριμένη ενέργεια.
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

