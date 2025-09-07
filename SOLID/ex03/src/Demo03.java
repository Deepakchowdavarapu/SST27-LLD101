public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator scc = new ShippingCostCalculator();
        System.out.println(scc.calculateShippingCost(new Shipment("STANDARD", 10)));
        
    }
}
