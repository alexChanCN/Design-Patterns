package com.cs.designPattern.strategy;

import com.cs.designPattern.strategy.fly.FlyBehavior;
import com.cs.designPattern.strategy.fly.FlyWithWings;
import com.cs.designPattern.strategy.quack.Quack;
import com.cs.designPattern.strategy.quack.QuackBehavior;

public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    public RedHeadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("Red Head Duck");
    }
}
