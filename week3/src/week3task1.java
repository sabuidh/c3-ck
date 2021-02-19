import java.lang.reflect.Array;
import java.util.*;

public class week3task1 {
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    int n = in.nextInt();
    int target = in.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i<6;i++) {
        nums[i] = in.nextInt();
        list.add(nums[i]);
    }
    System.out.println(threeSum(nums,target));
    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < len-2; i ++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){

                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right&&nums[left]==nums[left+1])
                        left++;
                    while(left<right&&nums[right]==nums[right-1])
                        right--;
                    left ++;
                    right --;
                }
                else if(sum <0) left++;
                else  if(sum>0) right--;
            }
        }
        return res;
    }
}
