import java.util.Scanner;

public class week6task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] num = new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                num[i][j]=in.nextInt();
        int[] nums= new int[m*n];
        int left=0,right=n-1;
        int top=0,bottom=m-1;
        int count=0;
        while(left<=right && top<=bottom) {
            for(int i=left;i<=right;i++) {
                nums[count]=num[top][i];
                count++;
            }
            for(int i=top+1;i<=bottom;i++) {
                nums[count]=num[i][right];
                count++;
            }

            for(int i=right-1;i>=left;i--) {
                nums[count]=num[bottom][i];
                count++;
            }
            for(int i=bottom-1;i>top;i--) {
                nums[count]=num[i][left];
                count++;
            }
            top++;
            right--;
            bottom--;
            left++;
        }
        for(int l:nums)
            System.out.println(l);
    }

}
