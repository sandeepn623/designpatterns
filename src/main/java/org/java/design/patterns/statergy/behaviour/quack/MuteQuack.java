package org.java.design.patterns.statergy.behaviour.quack;

public class MuteQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I can't quack or squeak!!");
    }
}
