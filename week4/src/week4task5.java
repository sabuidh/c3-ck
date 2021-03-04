import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class week4task5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++)
            nums[i] = in.nextInt();
        int num = Count(nums,n);
        if(num>0)
            System.out.println("主要元素是：" + num);
        else
            System.out.println("不存在主要元素");
    }

    public static int Count (int[] nums,int n) {
        int count = 0;
        for(int i=0;i<nums.length/2;i++) {
            for(int j=0;j<nums.length;j++) {
                if(nums[i]==nums[j])
                    count++;
            }
            if(count>nums.length/2)
                return nums[i];
            else
                count=0;
        }
        return -1;
    }
}
