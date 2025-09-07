public class Demo09 {
    public static void main(String[] args) {
        IDBRepository repository = new SqlOrderRepository();
        repository.save("12345");
    }
}
