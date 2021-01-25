import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c,count = 0;
        double x;
        for(int i = 100;i<1000;i++)
        {
            a =i /100;
            b = (i-a*100)/10;
            c = i%10;
            x = Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3);
            if(x==i)
                count++;
        }
        System.out.println("1000以内的水仙花数有" + count + "个");
    }
}
