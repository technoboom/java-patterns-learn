package com.technoboom.factory.PizzaFactory;

import com.technoboom.factory.PizzaFactory.Pizza;
import com.technoboom.factory.PizzaFactory.factories.PizzaIngredientFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/5/17
 * Time: 11:19 PM
 * Project: patterns-learn
 * Package: com.technoboom.factory.PizzaFactory.ingridients
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class ClamsPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamsPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("Prepare " + this.name);
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClam();
        sauce = pizzaIngredientFactory.createSauce();
        dough = pizzaIngredientFactory.createDough();
    }
}
