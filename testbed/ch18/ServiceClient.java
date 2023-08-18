package gr.aueb.cf.testbed.ch18;

public class ServiceClient {
    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImpl();

        // Create and add an account
        Account account = new Account(1, "Χρήστος Π.", 1000.0);
        accountService.addAccount(account);

        // Get and display account info
        Account retrievedAccount = accountService.getAccountById(1);
        System.out.println("Account ID: " + retrievedAccount.getAccountId());
        System.out.println("Account Holder: " + retrievedAccount.getAccountHolder());
        System.out.println("Balance: " + retrievedAccount.getBalance());

        // Deposit and withdraw
        accountService.deposit(1, 500.0);
        accountService.withdraw(1, 200.0);
        System.out.println("Updated Balance: " + retrievedAccount.getBalance());
    }
}



