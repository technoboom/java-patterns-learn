package com.technoboom.strategy.MiniDuckSimulator;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/18/17
 * Time: 1:07 PM
 * Project: patterns-learn
 * Package: com.technoboom.GameUDuck
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Sorry. I can't fly");
    }
}
