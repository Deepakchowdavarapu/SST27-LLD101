public class PaymentSelector {
    public static IPaymentProvider getPaymentProvider(String provider) {
        if (provider.equals("UPI")) {
            return new UPIPayment();
        } else if (provider.equals("Card")) {
            return new CardPayment();
        } else if (provider.equals("Wallet")) {
            return new WalletPayment();
        }
        return null;
    }
}
