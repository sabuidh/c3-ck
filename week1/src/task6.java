
public class task6 {
    public static void main(String[] args) {
        BankAcount BA = new BankAcount();

    }
}

class BankAcount{
    private String Username;
    private double balance;
    public BankAcount(){}
    public BankAcount(String Username, double balance){
        this.Username=Username;
        this.balance=balance;
    }
}