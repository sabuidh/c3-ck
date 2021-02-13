import java.util.ArrayList;
import java.util.Scanner;

public class week2task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = new String();
        s = in.nextLine();
        ArrayList<String> find = new ArrayList<String>();
        int j =0;
        for(int i = 0;i<s.length();)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                for (j = i + 1;;) {
                    if(j<s.length() && s.charAt(j) >= '0' && s.charAt(j)<='9')
                        j++;
                    else
                        {
                        String num = s.substring(i,j);
                        find.add(num);
                        break;
                        }
                }
                i=j;
            }
            else
                i++;
        }
//        int i = 0;
//        while (i < s.length()) {
//            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
//                int j = i + 1;
//                while (j < s.length() && s.charAt(j) >= '0' && s.charAt(j) <= '9') {
//                    j++;
//                }
//                String numbers = s.substring(i, j);
//                find.add(numbers);
//                i = j;
//            } else {
//                i++;
//            }
//
//        }
        System.out.println(find);
    }
}
