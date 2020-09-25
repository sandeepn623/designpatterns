package org.java.design.patterns.strategy;

import org.java.design.patterns.statergy.behaviour.fly.FlyNoWay;
import org.java.design.patterns.statergy.behaviour.fly.FlyWithWings;
import org.java.design.patterns.statergy.behaviour.fly.IFlyBehaviour;
import org.java.design.patterns.statergy.behaviour.quack.IQuackBehaviour;
import org.java.design.patterns.statergy.behaviour.quack.MuteQuack;
import org.java.design.patterns.statergy.behaviour.quack.Quack;
import org.java.design.patterns.statergy.behaviour.quack.Squeak;
import org.java.design.patterns.statergy.concrete.Duck;
import org.java.design.patterns.statergy.concrete.MallardDuck;
import org.junit.jupiter.api.Test;

public class TestStrategyPattern {

    @Test
    public void test_mallard_duck_can_fly_and_quack(){
        IFlyBehaviour flyBehaviour = new FlyWithWings();
        IQuackBehaviour quackBehaviour = new Quack();
        Duck duck = new MallardDuck(flyBehaviour, quackBehaviour);
        duck.display();
        duck.performFly();
        duck.performQuack();
    }

    @Test
    public void test_mallard_duck_cannot_fly_but_can_quack(){
        IFlyBehaviour flyBehaviour = new FlyNoWay();
        IQuackBehaviour quackBehaviour = new Quack();
        Duck duck = new MallardDuck(flyBehaviour, quackBehaviour);
        duck.display();
        duck.performFly();
        duck.performQuack();
    }

    @Test
    public void test_mallard_duck_cannot_fly_and_quack(){
        IFlyBehaviour flyBehaviour = new FlyNoWay();
        IQuackBehaviour quackBehaviour = new MuteQuack();
        Duck duck = new MallardDuck(flyBehaviour, quackBehaviour);
        duck.display();
        duck.performFly();
        duck.performQuack();
    }

    @Test
    public void test_mallard_duck_cannot_fly_and_quack_to_can_fly_and_squeak(){
        IFlyBehaviour flyBehaviour = new FlyNoWay();
        IQuackBehaviour quackBehaviour = new MuteQuack();
        Duck duck = new MallardDuck(flyBehaviour, quackBehaviour);
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehaviour(new FlyWithWings());
        duck.setQuackBehaviour(new Squeak());
        duck.performFly();
        duck.performQuack();
    }
}
