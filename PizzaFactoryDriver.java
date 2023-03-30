package PizzaFactory;

public class PizzaFactoryDriver {
	public static void main(String[] args) {
		        
		        Crust crust = new Crust();
		        crust.type = "thin";
		        crust.price = 5.99;

		        
		        Inventory inventory = new Inventory();
		        inventory.topping_inventory = "pepperoni, mushrooms, onions";
		        inventory.side_inventory = "garlic bread, wings";
		        inventory.crust_inventory = "thin, deep dish";

		        
		        Menu menu = new Menu();
		        menu.pizza = new String[]{"cheese", "pepperoni", "mushroom"};
		        menu.toppings = new String[]{"extra cheese", "olives", "sausage"};

		        
		        Order order = new Order();
		        order.pizza_list = new String[]{"cheese", "mushroom"};
		        order.side_list = new String[]{"garlic bread"};
		        order.total_price = 17.97;

		        
		        String[] toppings = new String[]{"pepperoni", "mushrooms"};
		        Pizza pizza = new Pizza("Pepperoni Mushroom", 12.99, 12, "thin", toppings);

		        
		        Sides sides = new Sides();
		        sides.name = "Garlic Bread";
		        sides.price = 3.99;

		        
		        Toppings topping = new Toppings();
		        topping.name = "Extra Cheese";
		        topping.price = 1.99;

		       
		        System.out.println("The " + crust.type + " crust costs Rs" + crust.price);
		        System.out.println("We have the following toppings in inventory: " + inventory.topping_inventory);
		        System.out.println("Our menu includes the following pizzas: " + menu.pizza[0] + ", " + menu.pizza[1] + ", " + menu.pizza[2]);
		        System.out.println("Your order includes " + order.pizza_list.length + " pizzas and " + order.side_list.length + " sides, for a total of Rs" + order.total_price);
		        System.out.println("The " + pizza.name + " pizza costs Rs" + pizza.price);
		        System.out.println("The " + sides.name + " side costs Rs" + sides.price);
		        System.out.println("The " + topping.name + " topping costs Rs" + topping.price);
		    }
		}
