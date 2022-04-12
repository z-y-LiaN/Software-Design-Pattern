package Strategy.Movie;

public class MovieTicket {
    private double price;
    // context类持有strategy类的引用
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }
    // 可动态替换打折方式
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    // 委托给discount
    public double getPrice() {
        return discount.calculate(price);
    }
}
