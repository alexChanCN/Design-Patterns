package com.cs.designPattern.factory.abstract_factory;


public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String cheese;
    String clam;

    abstract void prepare();

    void bake(){
        System.out.println("bake");
    }

    void cut(){
        System.out.println("cut");
    }

    void box(){
        System.out.println("box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", clam='" + clam + '\'' +
                '}';
    }
}
