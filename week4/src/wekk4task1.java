import java.util.Scanner;

public class wekk4task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string,pattern;
        System.out.println("Please input string:");
        string = in.nextLine();
        System.out.println("Please input pattern:");
        pattern = in.nextLine();
        System.out.println(found(string,pattern));
    }

    public static int found(String s,String p) {
        int flag=0,t=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == p.charAt(0)) {
                String compare = s.substring(i,i+p.length());
                if(compare.equals(p)) {
                    flag = i;
                    t = 1;
                    break;
                }
            }
        }
        if(t != 0)
            return flag;
        else
            return -1;
    }
}
