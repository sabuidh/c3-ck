import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int shi1,xu1;
        int shi2,xu2;
        System.out.println("请输入第一个数的实部和虚部：");
        shi1 = in.nextInt();
        xu1 = in.nextInt();
        System.out.println("请输入第二个数的实部和虚部：");
        shi2 = in.nextInt();
        xu2 = in.nextInt();
        complex cp = new complex(shi1,shi2,xu1,xu2);
        complex.add(shi1,shi2,xu1,xu2);
        complex.reduce(shi1,shi2,xu1,xu2);
        complex.multiply(shi1,shi2,xu1,xu2);
    }

}

class complex{
    int shi1,xu1;
    int shi2,xu2;
    public complex(){}
    public complex(int shi1,int shi2,int xu1,int xu2){
        this.shi1=shi1;
        this.xu1=xu1;
        this.shi2=shi2;
        this.xu2=xu2;
    }
    public static void add(int shi1,int shi2,int xu1,int xu2){
        int a,b;
        a=shi1+shi2;
        b=xu1+xu2;
        System.out.println("两复数相加的结果为：" + a + "+" + b + "i");
    }
    public static void reduce(int shi1,int shi2,int xu1,int xu2){
        int a,b;
        a=shi1-shi2;
        b=xu1-xu2;
        System.out.println("两复数相减的结果为：" + a + "+" + b + "i");
    }
    public static void multiply(int shi1,int shi2,int xu1,int xu2){
        int a,b;
        a=shi1*shi2-xu1*xu2;
        b=shi1*xu2+shi2*xu1;
        System.out.println("两复数相乘的结果为：" + a + "+" + b + "i");
    }
}