package sort;

import java.util.Arrays;
import java.util.Scanner;

//冒泡排序
public class Bubble_Sort {
    public static void bubbleSort(int[] arr) throws Exception{
        int n = arr.length;
        for(int i=1;i<n;i++){ //第一个for 循环代表着最多需要循环n次来完成排序
            boolean flag = true; //作为一个判定点，如果flag为false则说明以及排好序
            for(int j=0;j<n-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag=false;
                }
            }
            if (flag){//假如flag没变说明此次没有发生交换，说明已经排序好了，可以跳出.
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        try {
            bubbleSort(arr);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

}
