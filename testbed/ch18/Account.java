package gr.aueb.cf.testbed.ch18;

public class Account {
    private int accountId;
    private String accountHolder;
    private double balance;

    /**
     * Constructs an empty Account object.
     */
    public Account() {}

    /**
     * Constructs an Account object with the provided information.
     *
     * @param accountId     The unique identifier of the account.
     * @param accountHolder The name of the account holder.
     * @param balance       The initial balance of the account.
     */
    public Account(int accountId, String accountHolder, double balance) {
        this.accountId = accountId;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    /**
     * Retrieves the unique identifier of the account.
     *
     * @return The account ID.
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * Sets the unique identifier of the account.
     *
     * @param accountId The new account ID.
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    /**
     * Retrieves the name of the account holder.
     *
     * @return The account holder's name.
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Sets the name of the account holder.
     *
     * @param accountHolder The new account holder's name.
     */
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The account balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the balance of the account.
     *
     * @param balance The new account balance.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Returns a string representation of the Account object.
     *
     * @return A string containing the account information.
     */
    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }
}



