package com.cs.designPattern.strategy.fly;

import com.cs.designPattern.strategy.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
