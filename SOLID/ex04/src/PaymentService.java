
public class PaymentService {
    String pay(Payment payment) {
        IPaymentProvider paymentProvider = PaymentSelector.getPaymentProvider(payment.provider);
        if (paymentProvider != null) {
            return paymentProvider.pay(payment.amount);
        }
        return "Invalid payment provider";
        
    }
}