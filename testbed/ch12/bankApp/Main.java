package gr.aueb.cf.testbed.ch12.bankApp;

import gr.aueb.cf.testbed.ch12.bankApp.model.Account;
import gr.aueb.cf.testbed.ch12.bankApp.exceptions.InsufficientFundsException;
import gr.aueb.cf.testbed.ch12.bankApp.model.JointAccount;
import gr.aueb.cf.testbed.ch12.bankApp.model.OverdraftAccount;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία ενός απλού λογαριασμού
        Account account1 = new Account("12345", 1000.0);

        // Εκτύπωση των στοιχείων του λογαριασμού
        System.out.println("Απλός λογαριασμός");
        System.out.println("Αριθμός λογαριασμού: " + account1.getAccountNumber());
        System.out.println("Υπόλοιπο: " + account1.getBalance());

        try {
            // Κατάθεση ποσού 500 ευρώ
            account1.deposit(500);

            // Εκτύπωση των νέων στοιχείων του λογαριασμού
            System.out.println("Νέο υπόλοιπο: " + account1.getBalance());

            // Ανάληψη ποσού 200 ευρώ
            account1.withdraw(200);

            // Εκτύπωση των νέων στοιχείων του λογαριασμού
            System.out.println("Νέο υπόλοιπο μετά την ανάληψη: " + account1.getBalance());

            // Ανάληψη ποσού 2000 ευρώ - Θα εγείρει την εξαίρεση InsufficientFundsException
            account1.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println("Σφάλμα: " + e.getMessage());
        }

        // Δημιουργία ενός λογαριασμού με δυνατότητα υπεράντησης υπολοίπου
        OverdraftAccount account2 = new OverdraftAccount("67890", 1500.0, 500.0);

        // Εκτύπωση των στοιχείων του λογαριασμού με υπεράντηση υπολοίπου
        System.out.println("\nΛογαριασμός με υπεράντηση υπολοίπου");
        System.out.println("Αριθμός λογαριασμού: " + account2.getAccountNumber());
        System.out.println("Υπόλοιπο: " + account2.getBalance());

        try {
            // Ανάληψη ποσού 200 ευρώ
            account2.withdraw(200);

            // Εκτύπωση των νέων στοιχείων του λογαριασμού
            System.out.println("Νέο υπόλοιπο: " + account2.getBalance());

            // Ανάληψη ποσού 2500 ευρώ - Θα εγείρει την εξαίρεση InsufficientFundsException
            account2.withdraw(2500);
        } catch (InsufficientFundsException e) {
            System.out.println("Σφάλμα: " + e.getMessage());
        }

        // Δημιουργία ενός κοινόκτητου λογαριασμού
        JointAccount jointAccount = new JointAccount(account1, account2);

        // Εκτύπωση των στοιχείων του κοινόκτητου λογαριασμού
        System.out.println("\nΚοινόκτητος λογαριασμός");
        System.out.println("Αριθμός λογαριασμού κατόχου 1: " + jointAccount.getHolder1().getAccountNumber());
        System.out.println("Υπόλοιπο κατόχου 1: " + jointAccount.getHolder1().getBalance());
        System.out.println("Αριθμός λογαριασμού κατόχου 2: " + jointAccount.getHolder2().getAccountNumber());
        System.out.println("Υπόλοιπο κατόχου 2: " + jointAccount.getHolder2().getBalance());
    }
}
