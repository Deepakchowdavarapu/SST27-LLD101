public class express implements ICostType {
    public double cost(Shipment s) {
        return 100 + (10 * s.weight);
    }
    
}
