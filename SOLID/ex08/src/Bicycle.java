public class Bicycle implements PhysicalVehicle {

    @Override
    public void pedal(int effort) {
        System.out.println("Pedaling the bicycle with effort: " + effort);
    }
    
}