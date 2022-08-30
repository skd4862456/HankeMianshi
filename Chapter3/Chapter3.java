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
        //       苹果8元，草莓13元 芒果20元预期结果数组
        BigDecimal[] arrResult= new BigDecimal[]
                {BigDecimal.valueOf(98.4),BigDecimal.valueOf(47.2),BigDecimal.valueOf(1197.6),
                        BigDecimal.valueOf(969),BigDecimal.valueOf(139)};
//        新建水果对象
        Fruit apple=new Fruit(BigDecimal.valueOf(8),BigDecimal.valueOf(1));
        Fruit strawberry=new Fruit(BigDecimal.valueOf(13),BigDecimal.valueOf(0.8));
        Fruit mongo=new Fruit(BigDecimal.valueOf(20),BigDecimal.valueOf(1));

        BigDecimal sum;
        //        调用函数计算
        for (int i = 0 ;i < arr1.length ;i++) {
            sum = calculate(arr1[i],arr2[i],arr3[i],apple,strawberry,mongo);
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
