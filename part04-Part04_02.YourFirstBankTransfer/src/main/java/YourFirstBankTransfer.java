
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        matsAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(matsAccount.toString());
        System.out.println(myAccount.toString());
    }
}
