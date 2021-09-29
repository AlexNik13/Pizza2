package Pizza3;

import Pizza3.ingredients.Ingredient;
import Pizza3.pizza.Pizza;
import Pizza3.pizza.PizzaType;

public interface Pizzaria {

    Pizza createPizza(PizzaType type);

    Pizza addIngredients (Pizza pizza, Ingredient[] additionalIngredients);

    Ingredient[] getBaseIngredients();
}
