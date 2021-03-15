import java.util.Scanner;

public class week5task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 0 || x<=-231 || x>=230) {
            System.out.println(x);
        } else if (x < 0 && x > -231) {
            char[] c = flip(Math.abs(x));
            System.out.print('-');
            for(int i=c.length-1;i>=0;i--)
                System.out.print(c[i]);
        }
        else if (x > 0 && x < 230) {
            char[] c = flip(x);
            for(int i=c.length-1;i>=0;i--)
                System.out.print(c[i]);
        }
    }

    public static char[] flip(int x) {
        int count = 0;
        String s = String.valueOf(x);
        char[] c1 = new char[s.length()];
//        char[] c2 = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c1[i] = s.charAt(i);
        }
        return c1;
    }

}
