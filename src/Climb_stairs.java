
//初识动态规划
//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
//
//
//示例 1：
//
//输入：n = 2
//输出：2
//解释：有两种方法可以爬到楼顶。
//1. 1 阶 + 1 阶
//2. 2 阶
import java.util.Scanner;

public class Climb_stairs {
    //把问题拆分成i-1和i-2的问题，第i-1和第i-2都可以到达第i个阶梯,所以得出递推公式dp[i]=dp[i-1]+dp[i-2]
    public int climbStairs(int n){
        if (n==1)return 1;
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Climb_stairs climb_stairs = new Climb_stairs();
        System.out.println(climb_stairs.climbStairs(num));
    }
}
