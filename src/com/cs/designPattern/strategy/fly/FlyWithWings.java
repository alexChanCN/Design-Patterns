package com.cs.designPattern.strategy.fly;

import com.cs.designPattern.strategy.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
