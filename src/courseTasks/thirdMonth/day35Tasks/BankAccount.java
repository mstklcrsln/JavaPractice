package courseTasks.thirdMonth.day35Tasks;

public class BankAccount {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setBalance(balance);
        setAccountNumber(accountNumber);
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder.isEmpty() || accountHolder.isBlank()){
            System.err.println("ınvalid entry");
            return;
        }
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber<0){
            System.err.println("Invelid Entry");
            return;
        }
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void  deposit(double amount){
        if (balance<0){
            System.err.println(accountHolder+ "Your balance is minus "+ balance);
            return;
        }
        System.out.println("Your deposit is "+ amount+ " $ to your account" );
        balance+=amount;
    }

    public void withdraw (double amount){
        System.out.println("You want to withdraw "+ amount + " $ from your ban account");
        if (balance>=amount){
        balance -= amount;
        } else {
            System.err.println("Your balance is less");
            return;
        }


    }

    public void checkBalance (){
        System.out.println(accountHolder+ " your current balance is "+ balance+ " $");
    }
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance
        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()
            DO NOT duplicate any code fragments
 */