import java.math.BigDecimal;

/**
 * @author raynor
 */
public class Chapter2 {
    public static BigDecimal fruit(int a, int b,int c) {
        return BigDecimal.valueOf(13L * b + 8L * a + 20L * c);
    }
    public static void main(String[] args) {
        //        测试用例，计算用了多少钱
        int[] arr1= new int[]{1,2,10,32,0};
        int[] arr2= new int[]{1,3,44,5,3};
        int[] arr3= new int[]{4,0,33,22,5};
        //       苹果8元，草莓13元 芒果20元预期结果数组
        BigDecimal[] arrResult= new BigDecimal[]
                {BigDecimal.valueOf(101),BigDecimal.valueOf(55),BigDecimal.valueOf(1312),
                        BigDecimal.valueOf(969),BigDecimal.valueOf(139)};
        BigDecimal sum = BigDecimal.valueOf(0);
//        调用函数计算
        for (int i = 0 ;i < arr1.length ;i++) {
            sum = fruit(arr1[i],arr2[i],arr3[i]);
            System.out.println("苹果买了"+arr1[i]+"个草莓买了"+arr2[i]+"个芒果买了"+arr3[i]+"个,共花了"+sum);
            BigDecimal checkSum=arrResult[i];
//        检测结果
            if (checkSum.equals(sum)){
                System.out.println("预期结果为"+checkSum+"计算正确");
            }
            else {
                System.out.println("预期结果为"+checkSum+"计算错误");
            }
        }
    }
}
