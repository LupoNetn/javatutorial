import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private static List<BankAccount> allAccounts = new ArrayList<>();

    String userName;
    String currency;
    String bvn;

    private int balance;
    private String accountNumber;

    public BankAccount(String userName, String currency, String bvn) {
        this.userName = userName;
        this.currency = currency;
        this.bvn = bvn;

        this.accountNumber = "BJ" + bvn;

        allAccounts.add(this);
    }

    public static List<BankAccount> getAllAccounts() {
        return allAccounts;
    }

    public void sendCash(int amount) {}

    public int getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }


}