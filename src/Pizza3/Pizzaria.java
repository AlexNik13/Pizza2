package Pizza3;

import Pizza3.ingredients.Ingredient;
import Pizza3.pizza.Pizza;

public interface Pizzaria {

    //Pizza createPizza(PizzaType type, Ingredient[] baseIngredients);
    Pizza createPizza(PizzaType type);

    Pizza addIngredients (Pizza pizza, Ingredient[] additionalIngredients);

    Ingredient[] getBaseIngredients();
}
