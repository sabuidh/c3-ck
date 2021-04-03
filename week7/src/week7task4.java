import java.util.Scanner;

public class week7task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len=in.nextInt();
        int[] nums = new int[len];
        for(int i=0;i<nums.length;i++)
            nums[i]=in.nextInt();
        int k=in.nextInt();
        for(int i =0;i<len-k+1;i++) {
            int[] num = new int[k];
            int t=i;
            for(int j=0;j<num.length;j++) {

                num[j]=nums[t++];
            }
            int max = findMax(num);
            System.out.println(max);
        }
    }

    public static int findMax(int[] num) {
        int max=num[0];
        for(int i=0;i<num.length;i++) {
            if(num[i]>max)
                max=num[i];
        }
        return max;
    }
}
