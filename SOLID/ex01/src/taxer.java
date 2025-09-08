public class taxer implements ITax{
    @Override
    public double totalWithTax(double subtotal) {
        return subtotal*(1.18);
    }
}
