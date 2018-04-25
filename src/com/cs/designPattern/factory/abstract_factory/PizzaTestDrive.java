package com.cs.designPattern.factory.abstract_factory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore  =new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza);

        Pizza pizza2 = chicagoStore.orderPizza("clam");
        System.out.println(pizza2);
    }
}
