import java.util.Scanner;

public class week2task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        System.out.println("请输入单词");
        for (int i = 0; i <n; i++) {
            s[i] = in.next();
        }
        compare(s,n);
    }

    public static void compare(String[] s, int n) {
        int length = s[0].length();
        String find = s[0];
        for(int i = 0 ;i<n;i++)
        {
            if(length>s[i].length())
                length = s[i].length();
        }
        for(int i=0;i<n;i++)
        {
            int j = 0;
            for(; j<length;j++)
            {
                if(s[i].charAt(j)!=find.charAt(j))
                    break;
            }
            find = s[i].substring(0,j);
        }
        if(find.equals(s[0]))
            System.out.println("");
        else
            System.out.println(find);
    }
}