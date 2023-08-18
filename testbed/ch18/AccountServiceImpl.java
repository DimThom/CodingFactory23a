package gr.aueb.cf.testbed.ch18;

import java.util.HashMap;
import java.util.Map;

public class AccountServiceImpl implements AccountService {
    private Map<Integer, Account> accounts = new HashMap<>();

    /**
     * Retrieves an account based on the account ID.
     *
     * @param accountId The unique identifier of the account.
     * @return The account associated with the given account ID.
     */
    @Override
    public Account getAccountById(int accountId) {
        return accounts.get(accountId);
    }

    /**
     * Deposits an amount into an account.
     *
     * @param accountId The account ID for the deposit.
     * @param amount    The amount to be deposited.
     */
    @Override
    public void deposit(int accountId, double amount) {
        Account account = accounts.get(accountId);
        account.setBalance(account.getBalance() + amount);
    }

    /**
     * Performs a withdrawal of funds from an account.
     *
     * @param accountId The account ID for the withdrawal.
     * @param amount    The amount to be withdrawn.
     */
    @Override
    public void withdraw(int accountId, double amount) {
        Account account = accounts.get(accountId);
        account.setBalance(account.getBalance() - amount);
    }

    /**
     * Adds a new account to the service.
     *
     * @param account The account to be added.
     */
    @Override
    public void addAccount(Account account) {
        accounts.put(account.getAccountId(), account);
    }
}




