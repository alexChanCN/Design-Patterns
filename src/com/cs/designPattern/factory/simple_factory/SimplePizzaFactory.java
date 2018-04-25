package com.cs.designPattern.factory.simple_factory;

import com.cs.designPattern.factory.factory_method.NYStyleCheesePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
