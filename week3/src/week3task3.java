import java.util.*;

public class week3task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Set<Character> characters = new HashSet<Character>();
        for(int i=0;i<s.length();i++)
            characters.add(s.charAt(i));
        System.out.println(characters);
    }
}
