import java.math.BigDecimal;

/**
 * @author raynor
 */
public class Chapter2 {
    public static BigDecimal fruit(int a, int b,int c) {
        return BigDecimal.valueOf(13L * b + 8L * a + 20L * c);
    }
    public static void main(String[] args) {
        //        �����������������˶���Ǯ
        int[] arr1= new int[]{1,2,10,32,0};
        int[] arr2= new int[]{1,3,44,5,3};
        int[] arr3= new int[]{4,0,33,22,5};
        //       ƻ��8Ԫ����ݮ13Ԫ â��20ԪԤ�ڽ������
        BigDecimal[] arrResult= new BigDecimal[]
                {BigDecimal.valueOf(101),BigDecimal.valueOf(55),BigDecimal.valueOf(1312),
                        BigDecimal.valueOf(969),BigDecimal.valueOf(139)};
        BigDecimal sum = BigDecimal.valueOf(0);
//        ���ú�������
        for (int i = 0 ;i < arr1.length ;i++) {
            sum = fruit(arr1[i],arr2[i],arr3[i]);
            System.out.println("ƻ������"+arr1[i]+"����ݮ����"+arr2[i]+"��â������"+arr3[i]+"��,������"+sum);
            BigDecimal checkSum=arrResult[i];
//        �����
            if (checkSum.equals(sum)){
                System.out.println("Ԥ�ڽ��Ϊ"+checkSum+"������ȷ");
            }
            else {
                System.out.println("Ԥ�ڽ��Ϊ"+checkSum+"�������");
            }
        }
    }
}
