package leetcode_midium;
//贪心
//盛最多的水
//给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
//
//        找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
//        返回容器可以储存的最大水量。
//
//
//        输入：[1,8,6,2,5,4,8,3,7]
//        输出：49
//        解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
public class maxArea {
    public int maxArea(int[] height) {
        int a=0;
        int b=height.length -1;
        int max=0;
        while(a!=b){
            int wide =b-a;
            int high=0;
            if(height[a]>height[b]){
                high=height[b];
                b=b-1;
            }else{
                high=height[a];
                a=a+1;
            }
            if (wide*high>=max){
                max=wide*high;
            }
        }
        return max;
    }
}
