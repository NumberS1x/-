//快速排序的实现

public class quick_sort {

    public static void main(String[] args){
        int[] arr = new int[]{7,1,6,2,5,3,4,4,8,9};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arr,int low,int high){
        if (low < high){
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    public static int partition(int[] arr,int low,int high){
        int i = low;//作为划分点的索引，用来划分比划分点大或者小的数字
        int pivot = arr[high];//划分点一般设置为最后一位数
        for(int j=low;j<high;j++){
            if (arr[j]<=pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,high);//最后将划分点和索引换位置来让划分点左边、右边都分别小于和大于划分点
        return i;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
