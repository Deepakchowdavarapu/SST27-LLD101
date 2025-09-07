public class ShipmentSelector {
    public static ICostType getCostType(String type) {
        if (type.equals("STANDARD")) {
            return new Standard();
        } else if (type.equals("EXPRESS")) {
            return new express();
        } else if (type.equals("OVERNIGHT")) {
            return new Overnight();
        }
        return null;
    }
}
