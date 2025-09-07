public class ShippingCostCalculator {
    double calculateShippingCost(Shipment s) {
        ICostType costType = ShipmentSelector.getCostType(s.type);
        if (costType != null) {
            return costType.cost(s);
        }
        throw new RuntimeException("Invalid shipment type");
    }
}
