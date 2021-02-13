import java.util.Scanner;

public class week2task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入矩阵大小");
        int n = in.nextInt();
        int[][] nums = new int[n][n];
        System.out.println("请输入数字");
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                int x=in.nextInt();
                nums[i][j] = x;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=nums.length-1;j>=0;j--)
            {
                System.out.println(nums[i][j]);
            }
        }
    }
}
