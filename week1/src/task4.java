import java.sql.SQLOutput;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for (int k=0;k<nums.length;k++)
            nums[k] = in.nextInt();
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                count++;
            }
            else if (count != 0)
            {
                nums[i - count] = nums[i];
                nums[i] = 0;
            }
        }
            for (int l=0;l<nums.length;l++)
                System.out.print(nums[l] + " ");
    }
}

