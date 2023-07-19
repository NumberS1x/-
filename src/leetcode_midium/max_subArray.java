package leetcode_midium;

import java.util.Scanner;


//给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
//子数组 是数组中的一个连续部分。
//
//
//
//示例 1：
//
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
public class max_subArray {
    public int maxSubArray(int[] nums){
        if (nums==null || nums.length==0){
            return 0;
        }
        int n=nums.length;
        int[] arr = new int[n+1];
        arr[0]=nums[0];//初始化
        int res = arr[0];//记录最大值
        for(int i=1;i<n;i++){
            //根据分析，把以第i个结尾的最大数组和拆分为第i个元素和以第i-1为结尾的最大子数组和
            //所以arr[i]就是一个以i结尾的最大数组和
            arr[i]=Math.max(arr[i-1],0)+nums[i];
            res=Math.max(res,arr[i]);
        }
        return res;
    }
}
