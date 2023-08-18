package gr.aueb.cf.testbed.ch18;

public interface AccountService {

    /**
     * Retrieves an account based on the account ID.
     *
     * @param accountId The unique identifier of the account.
     * @return The account associated with the given account ID.
     */
    Account getAccountById(int accountId);

    /**
     * Deposits an amount into an account.
     *
     * @param accountId The account ID for the deposit.
     * @param amount    The amount to be deposited.
     */
    void deposit(int accountId, double amount);

    /**
     * Performs a withdrawal of funds from an account.
     *
     * @param accountId The account ID for the withdrawal.
     * @param amount    The amount to be withdrawn.
     */
    void withdraw(int accountId, double amount);

    /**
     * Adds a new account to the service.
     *
     * @param account The account to be added.
     */
    void addAccount(Account account);
}



