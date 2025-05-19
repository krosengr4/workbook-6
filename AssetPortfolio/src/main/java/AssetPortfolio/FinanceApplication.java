package AssetPortfolio;

public class FinanceApplication {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", 123, 12500);
        BankAccount account2 = new BankAccount("Gary", 456, 1500);

        account1.deposit(100);
        account2.deposit(200);

        System.out.println("Account 1 Value: " + account1.getBalance());
        System.out.println("Account 2 Value: " + account2.getBalance());
    }

}
