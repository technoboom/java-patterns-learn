package com.technoboom.strategy.AdventureGame;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 1:32 PM
 * Project: patterns-learn
 * Package: com.technoboom.strategy.AdventureGame
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("[Attack with sword]");
    }
}
