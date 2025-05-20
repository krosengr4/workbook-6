package AssetPortfolio;

public class CreditCard implements IValuable{

    String name;
    int accountNumber;
    double balance;

    public CreditCard (String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //region getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //endregion

    public void charge(double amount) {
        this.balance -= amount;
    }

    public void pay(double amount){
        this.balance += amount;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
