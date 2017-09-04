package com.ritesh.ds;

class Food {
	String food;

	Food(String food) {
		this.food = food;
	}

	public void serveFood() {
		System.out.println("I'm serving " + this.food);
	}
}

class FastFood extends Food {

	FastFood(String food) {
		super(food);
	}
}

class Fruit extends Food {

	Fruit(String food) {
		super(food);
	}

}

class FoodFactory {
	public Food getFood(String order) {
		if ("FastFood".equals(order)) {
			return new FastFood(order);
		}
		else if ("Fruit".equals(order)) {
			return new Fruit(order);
		}
		return null;
	}
}

public class FactoryPattern {

	public static void main(String[] args) {
		FoodFactory myFoods = new FoodFactory();
		Food food1 = myFoods.getFood("FastFood");
		Food food2 = myFoods.getFood("Fruit");
		System.out.println("My name is: " + food1.getClass().getName());
		System.out.println("My name is: " + food2.getClass().getName());
		System.out.println("Our superclass is: " + food1.getClass().getSuperclass().getName());
		food1.serveFood();
		food2.serveFood();
	}

}
