package org.java.design.patterns.statergy.concrete;

import org.java.design.patterns.statergy.behaviour.fly.IFlyBehaviour;
import org.java.design.patterns.statergy.behaviour.quack.IQuackBehaviour;

public abstract class Duck {

    protected IFlyBehaviour flyBehaviour;

    protected IQuackBehaviour quackBehaviour;

    protected Duck(){}

    protected Duck(IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
