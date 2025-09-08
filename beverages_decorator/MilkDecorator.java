// package beverages_decorator;

public class MilkDecorator implements Coffee{

    private Coffee milkdecorator;
    
    public MilkDecorator(Coffee coffee) {
        this.milkdecorator = coffee;
    }
    
    @Override
    public int cost() {
        return 5 + milkdecorator.cost();
    }
    
}
