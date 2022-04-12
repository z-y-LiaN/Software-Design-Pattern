package Strategy.Movie;

public class VIPDiscount implements Discount {
    public double calculate(double price) {
        return price * 0.5;
    }
   
}
