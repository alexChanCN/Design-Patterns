package com.cs.designPattern.factory.factory_method;

public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }
        else if(type.equals("clam")){
            pizza = new NYStyleClamPizza();
        }
        return pizza;
    }
}
