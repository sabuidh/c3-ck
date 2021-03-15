import java.util.Scanner;

public class week5task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++)
            arr[i] = arr[i - 1] + arr[i - 2];
        System.out.println(arr[n]);

    }
}
