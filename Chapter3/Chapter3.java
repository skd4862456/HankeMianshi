package Chapter3;

import java.math.BigDecimal;

/**
 * @author raynor
 */
public class Chapter3 {

    public static BigDecimal calculate(BigDecimal a, BigDecimal b, BigDecimal c,Fruit apple,Fruit strawberry,Fruit mongo) {
        BigDecimal aPrice=apple.getPrice().multiply(apple.getDiscount());
        BigDecimal bPrice=strawberry.getPrice().multiply(strawberry.getDiscount());
        BigDecimal cPrice=mongo.getPrice().multiply(mongo.getDiscount());
        return a.multiply(aPrice).add(b.multiply(bPrice)).add(c.multiply(cPrice));
    }


    public static void main(String[] args){
        BigDecimal[] arr1= new BigDecimal[]{BigDecimal.valueOf(1),BigDecimal.valueOf(2),BigDecimal.valueOf(10),
                BigDecimal.valueOf(32),BigDecimal.valueOf(0)};
        BigDecimal[] arr2= new BigDecimal[]{BigDecimal.valueOf(1),BigDecimal.valueOf(3),BigDecimal.valueOf(44),
                BigDecimal.valueOf(5),BigDecimal.valueOf(3)};
        BigDecimal[] arr3= new BigDecimal[]{BigDecimal.valueOf(4),BigDecimal.valueOf(0),BigDecimal.valueOf(33),
                BigDecimal.valueOf(22),BigDecimal.valueOf(5)};
        //       ƻ��8Ԫ����ݮ13Ԫ â��20ԪԤ�ڽ������
        BigDecimal[] arrResult= new BigDecimal[]
                {BigDecimal.valueOf(98.4),BigDecimal.valueOf(47.2),BigDecimal.valueOf(1197.6),
                        BigDecimal.valueOf(969),BigDecimal.valueOf(139)};
//        �½�ˮ������
        Fruit apple=new Fruit(BigDecimal.valueOf(8),BigDecimal.valueOf(1));
        Fruit strawberry=new Fruit(BigDecimal.valueOf(13),BigDecimal.valueOf(0.8));
        Fruit mongo=new Fruit(BigDecimal.valueOf(20),BigDecimal.valueOf(1));

        BigDecimal sum;
        //        ���ú�������
        for (int i = 0 ;i < arr1.length ;i++) {
            sum = calculate(arr1[i],arr2[i],arr3[i],apple,strawberry,mongo);
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
