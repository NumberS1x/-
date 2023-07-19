//全排序
//递归和回溯
public class full_sort {
    public void fullSort(int[] arr,int start,int end){
        if (start == end){
            for(int i:arr){
                System.out.println(i);
            }
            System.out.println();
        }
        for(int i=start;i<=end;i++){
            swap(arr,i,start);//start最为最开始的索引，遍历i和start交换位置
            fullSort(arr,start+1,end);
            swap(arr,i,start);
        }
    }

    public void swap(int[] arr,int i,int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static class test{
        public static void main(String[] args){
            int[] arr = new int[]{1,2,3,4};
            new full_sort().fullSort(arr,0,3);
        }
    }
}
