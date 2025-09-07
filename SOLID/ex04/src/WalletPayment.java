public class WalletPayment implements IPaymentProvider {
    public String pay(double amount) {
        return "Paid via Wallet: " + amount;
    }
}
