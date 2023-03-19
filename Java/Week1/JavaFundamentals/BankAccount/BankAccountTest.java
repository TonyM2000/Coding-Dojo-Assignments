package Week1.JavaFundamentals.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount one = new BankAccount();
        BankAccount two = new BankAccount();
        one.depositSavingsBalance(100.00);
        one.depositCheckingBalance(5002.50);
        one.withdrawCheckingBalance(500.00);
        two.depositSavingsBalance(1000.69);
        two.depositCheckingBalance(240.50);
        one.getBalance();
        two.getBalance();
        System.out.println(BankAccount.numberOfAccounts);
        System.out.printf("The total across all accounts is %.2f",BankAccount.totalAcrossAccounts);
    }
}
