
public class Demo04 {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        System.out.println(ps.pay(new Payment("UPI", 100)));
        
    }
}
