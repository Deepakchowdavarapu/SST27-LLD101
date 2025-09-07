public class UPIPayment implements IPaymentProvider {
    public String pay(double amount) {
        return "Paid via UPI: " + amount;
    }
}
