public class SqlOrderRepository implements IDBRepository {
    @Override
    public void save(String id) {
        System.out.println("Order saved in SQL database with id: " + id);
    }
}
