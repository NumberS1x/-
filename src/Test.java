import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        int[] test = new int[]{1,0,0,0,1};
        int num = test.length;
        int[] temp = new int[num+2];
        System.arraycopy(test,0,temp,1,test.length);
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(temp));
    }
}
