package courseTasks.thirdMonth.day35Tasks;

public class BankAccountObjects {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Mesut kılıcarslan", 12365478L,2000);
        BankAccount account2 = new BankAccount("Ali Veli", 98745632L, 3000);
        BankAccount account3= new BankAccount("Fatma doğu", 1256987L, 200);

        account1.deposit(200); //Your deposit is 200.0 $ to your account
        account2.withdraw(4000);
        //You want to withdraw 4000.0 $ from your ban account
        //Your balance is less
        account3.checkBalance(); //Fatma doğu your current balance is 200.0 $
    }
}
