import java.util.Scanner;

public class week2task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎来到猜字游戏，请输入一个数:");
        int num = in.nextInt();
        Game nm = new Game();
        while(true) {
            if(nm.guess(num))
                break;
            else
                num = in.nextInt();
        }

    }
}

class Game {
    private static int v = 100;
    public void Game() {}
    public static boolean guess(int num) {
        if(num<v) {
            System.out.println("猜的有点小，再试一下吧！");
            return false;
        }
        else if(num>v) {
            System.out.println("猜大了嗷，再试一下吧！");
            return false;
        }
        else {
            System.out.println("恭喜你，猜对了！");
            return true;
        }
    }
}
