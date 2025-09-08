public class OrderService {
    INotifier emaINotifier;
    IDBrepository sqBrepository;
    ITax gsTax;
    void OrderService(INotifier emaINotifier , IDBrepository sqBrepository , ITax gsTax) {
        this.emaINotifier = emaINotifier;
        this.sqBrepository = sqBrepository;
        this.gsTax = gsTax;
    }

    void checkout(String customerEmail , double subtotal){
            double totaltax = gsTax.totalWithTax(subtotal);
            emaINotifier.send(customerEmail , totaltax);
    }
}