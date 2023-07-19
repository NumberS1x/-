package leetcode_midium;

import java.util.Iterator;
import java.util.List;
//给定一个三角形 triangle ，找出自顶向下的最小路径和。
//
//每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
//
//
//
//示例 1：
//
//输入：triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
//输出：11
//解释：如下面简图所示：
//   2
//  3 4
// 6 5 7
//4 1 8 3
//自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。

public class minimum_total {
    public int minimumTotal(List<List<Integer>> triangle){
        //从底部开始往上面推，arr[0][0]即是最大值;
        //arr[i][j]记录的是当前triangle[i][j]加上上层左或者上层右的最大值(记录的是当前的最大值再往上加)
        //把问题拆分成i和i+1的问题，经过i则必然经过i+1或者i+1,j+1所以比较i+1和i+1,j+1大小就可以得出i的最大值
        int n = triangle.size();
        int[][] arr = new int[n+1][n+1];
        List<Integer> row = triangle.get(n-1);
        for(int i=0;i<n;i++){
            arr[n-1][i]=row.get(i);
        }
        for(int i=n-2;i>=0;i--){
            List<Integer> nowRow = triangle.get(i);
            for(int j=0;j<i+1;j++){
                arr[i][j]=Math.min(arr[i+1][j]+nowRow.get(j),arr[i+1][j+1]+nowRow.get(j));
            }
        }
        return arr[0][0];

    }
}
