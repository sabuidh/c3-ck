import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("请选择服务类型");
        System.out.println("1       开户");
        System.out.println("2    查询余额");
        String name;
        double money;
        int x;
        x = in.nextInt();
        if(x == 1)
        {
            System.out.println("请输入您的姓名:");
            name = in.nextLine();
            System.out.println("请输入您的余额:");
            money = in.nextDouble();
            BankAcount BA = new BankAcount(name,money);
        }
        else
        {
            String Name;
            double balance;
            System.out.println("请输入您的姓名");
            Name = in.nextLine();
            BankAcount BA = new BankAcount(Name);
        }

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
    public BankAcount(String Username){
        System.out.println("您的账户余额为：" + balance);
    }
}