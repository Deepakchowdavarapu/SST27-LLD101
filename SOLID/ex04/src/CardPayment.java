public class CardPayment implements IPaymentProvider {
    public String pay(double amount) {
        return "Charged card: " + amount;
    }
    
}
