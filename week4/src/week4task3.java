import java.util.Scanner;

public class week4task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double decimal;
        System.out.println("Please input decimal:");
        decimal=in.nextDouble();
        System.out.println("转换为分数：" + Change(decimal));
    }

    public static String Change(double d) {
        String fraction;
        int count=0,base=10;
        while(d != Math.floor(d)) {
            count++;
            d*=base;
        } //当等式成立，小数已经转化为整数
        base =(int)Math.pow(base,count);
        int Cd = findCd((int)d,base);
        fraction = String.valueOf((int)d/Cd) + "/" + String.valueOf(base/Cd);
        return fraction;
    }

    public static int findCd(int a,int b) {
        int r = a%b;
        if(r!=0)
            return findCd(b,r);
        else
            return b;
    }
}
