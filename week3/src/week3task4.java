import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class week3task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        HashMap<Character,Integer> hashMap = repeat(s);
        for(char chars : hashMap.keySet())
            System.out.println(chars + ":" + hashMap.get(chars));

    }

    public static HashMap<Character,Integer> repeat(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),1);
            }
            else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        return map;
    }
}
