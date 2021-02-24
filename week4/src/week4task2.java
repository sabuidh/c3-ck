import java.util.HashMap;
import java.util.Scanner;

public class week4task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string;
        System.out.println("Please input string:");
        string = in.nextLine();
        if(find(string)>=0)
            System.out.println("Location is:" + find(string));
        else
            System.out.println("No single char.");
    }

    public static int find(String s) {
        char c;
        int flag=-1;
        for(int i = 0;i<s.length();i++) {
            c=s.charAt(i);
            for(int j = i+1;j<s.length();j++) {
                if(c == s.charAt(j)) {
                    break;
                }
                flag = i;
            }
            if(flag>=0)
                break;
        }
        return flag;
    }
}
