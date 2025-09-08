// package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		
		Coffee coffee = new Latte();
        System.out.println("Latte coffee");
		System.out.println(coffee.cost());
		
		coffee = new MilkDecorator(coffee);
		System.out.println("Coffee with milk");
		System.out.println(coffee.cost());
		

	}

}