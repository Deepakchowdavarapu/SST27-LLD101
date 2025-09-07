public class OrderController {
    void create(String id){
        System.out.println("Creating order with id: " + id);
        IDBRepository repository = new SqlOrderRepository();
        repository.save(id);
    }
}