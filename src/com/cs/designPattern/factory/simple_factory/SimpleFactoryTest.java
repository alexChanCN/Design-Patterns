package com.cs.designPattern.factory.simple_factory;


public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("cheese");
        store.orderPizza("clam");


    }
}
