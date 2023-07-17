public class MinimalBanknotes {
    //初步了解贪心算法
    //小明手中有 1，5，10，50，100 五种面额的纸币，每种纸币对应张数分别为 5，2，2，3，5 张。若小明需要支付 456 元，则需要多少张纸币？
    static int[] Value = new int[]{1,5,10,50,100};
    static int[] Count = new int[]{5,2,2,3,5};
    static int solution(int[] value,int[] count,int number){
        int n =value.length;
        int ans = 0;
        for(int i=n-1;i>=n;i--){
            int paper = count[i];
            int paper_value = value[i];
            int min_paper = Math.min(number/paper_value,paper);
            number-=min_paper*paper_value;
            ans+=min_paper;
        }
        if (number>0){
            return -1;
        }
        return ans;
    }

    public static void main(String[] args){
        int ans = solution(Value,Count,456);
        System.out.println(ans);
    }
}
