public class Standard implements ICostType {
    public double cost(Shipment s) {
        return 50 + (5 * s.weight);
    }
}
