import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight;
        double high,BMI;
        System.out.println("请输入你的身高(m):");
        high = in.nextDouble();
        System.out.println("请输入你的体重(kg):");
        weight = in.nextInt();
        BMI=weight/(Math.pow(high,2));
        System.out.println("BMI:" + BMI);
        if(BMI<18.5)
            System.out.println("过轻");
        else if(BMI>=18.5 && BMI<25)
            System.out.println("正常");
        else if(BMI>=25 && BMI<28)
            System.out.println("过重");
        else if(BMI>=28 && BMI<32)
            System.out.println("肥胖");
        else if(BMI>=32)
            System.out.println("过于肥胖");
    }
}
