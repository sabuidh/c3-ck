import java.util.HashMap;
import java.util.Scanner;

public class week7task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len=in.nextInt();
        int[] nums = new int[len];
        for(int i=0;i<nums.length;i++)
            nums[i]=in.nextInt();
        HashMap<Integer,Integer> map = conut(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            if(map.get(nums[i])==1)
                sum+=nums[i];
        }
        System.out.println(sum);
    }

    public static HashMap conut(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else {
                int count=map.get(nums[i]);
                map.put(nums[i],++count);
            }
        }
        return map;

    }
}
