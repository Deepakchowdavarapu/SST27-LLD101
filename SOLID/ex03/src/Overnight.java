public class Overnight implements ICostType {
    public double cost(Shipment s) {
        return 200 + (20 * s.weight);
    }
}
