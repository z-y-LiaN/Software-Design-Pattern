package Strategy.Movie;
/**
 * 某电影院售票系统为不同类型的用户提供不同打折方式（Discount），
 * 学生凭学生证享受8折优惠（StudentDiscount），
 * 儿童享受减免10元优惠（ChildrenDiscount），
 * VIP用户除享受半价优惠还可积分（VIPDiscount）
 */
public class Test {
   public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setPrice(100);
        movieTicket.setDiscount(new StudentDiscount());
        System.out.println("学生票价：" + movieTicket.getPrice());

        movieTicket.setPrice(100); 
        movieTicket.setDiscount(new ChildrenDiscount());
        System.out.println("儿童票价：" + movieTicket.getPrice());

        movieTicket.setPrice(100);
        movieTicket.setDiscount(new VIPDiscount());
        System.out.println("VIP票价：" + movieTicket.getPrice());
   }
}
