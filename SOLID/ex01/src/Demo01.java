

public class Demo01 {

    public static void main(String[] args) {
        INotifier emailClient = new Emailer();
        IDBrepository sqlConnec = new SqlDBRepository();
        ITax gsTax = new Taxer();

        OrderService orderService = new OrderService(emailClient, sqlConnec, gsTax);

        // Example call to checkout method
        orderService.checkout("order123",100.0);
    }
}
