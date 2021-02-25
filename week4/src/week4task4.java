import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class week4task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[6];
        for(int i=0;i<nums.length;i++) {
            nums[i]=in.nextInt();
        }
        sort(nums);
        for(int i=0;i<nums.length;i++)
            System.out.println(nums[i]);
        System.out.println("Please input num:");
        int n =in.nextInt();
        System.out.println(nums[n-1]);
    }

    public static void sort(int[] num) {
        int temp;
        for(int i=0;i<num.length-1;i++) {
            for(int j=i+1;j<num.length;j++) {
                if(num[i]>num[j]) {
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
    }
}

