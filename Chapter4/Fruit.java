package Chapter4.Chapter4;

import java.math.BigDecimal;

/**
 * @author raynor
 */
    public class Fruit {
        BigDecimal price;
        BigDecimal discount;

    public Fruit(BigDecimal price,BigDecimal discount){
        this.price=price;
        this.discount=discount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

}
