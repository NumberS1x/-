

//0-1背包问题
//有一个容量为V的背包，还有n个物体。现在忽略物体实际几何形状，我们认为只要背包的剩余容量大于等于物体体积，那就可以装进背包里。每个物体都有两个属性，即体积w和价值v。
//问：如何向背包装物体才能使背包中物体的总价值最大？
public class package_question {
    public int maxWeight(int v,int[] volume,int[] value){
        int[][] temp = new int[volume.length][v+1]; //temp[i][j]就是从0到第i个物体中选，放到体积为j的背包中的最大总价值
        for(int i=0;i<v;i++) temp[0][i]=0;//初始化，因为0个物体的总价值为0
        for(int i=0;i<volume.length;i++) temp[i][0]=0;//初始化，因为0个背包容量的总价值为0
        for(int i=1;i<volume.length;i++){
            for(int j=1;j<=v;j++){
                if (volume[i] < j ){
                    temp[i][j]=Math.max(temp[i-1][j],temp[i-1][j-1]+volume[i]);
                }else{
                    temp[i][j]=temp[i-1][j];
                }
            }
        }
        return temp[volume.length-1][v-1];
    }
    static class test{
        public static void main(String[] args){
            int v=8;
            int[] volume = new int[]{2,3,4,5};
            int[] value = new int[]{3,4,5,8};
            System.out.println(new package_question().maxWeight(v,volume,value));
        }
    }
}

