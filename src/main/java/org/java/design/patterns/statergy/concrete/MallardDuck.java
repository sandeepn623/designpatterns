package org.java.design.patterns.statergy.concrete;

import org.java.design.patterns.statergy.behaviour.fly.IFlyBehaviour;
import org.java.design.patterns.statergy.behaviour.quack.IQuackBehaviour;

public class MallardDuck extends Duck {

    public MallardDuck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I'm " + MallardDuck.class.getSimpleName());
    }


}
