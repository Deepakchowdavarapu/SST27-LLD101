

public class Demo01 {
    
    public static void main(String[] args) {
        INotifier emailClient = new Emailer();
        IDBrepository sqlConnec = new SqlDBRepository();
        ITax gsTax = new taxer();
        OrderService orderService = new OrderService(emailClient , sqlConnec , gsTax);
    }
}
