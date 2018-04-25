package com.cs.designPattern.factory.abstract_factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago cheese");
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago clam");
        }
        return pizza;
    }
}
