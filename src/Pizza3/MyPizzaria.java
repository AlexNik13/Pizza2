package Pizza3;

import Pizza3.ingredients.Ingredient;
import Pizza3.pizza.*;

public class MyPizzaria implements Pizzaria {

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza rezalt;
        switch (type){
            case MEAT -> {
                PizzaMeat meatPizza = new PizzaMeat();
                //meatPizza.setIngredients(getBaseIngredients()); // перебивает ингридиенты пицци
                rezalt = meatPizza;
                break;
            }
            case VEGETAN -> {
                PizzaVegan veganPizza = new PizzaVegan();
                rezalt = veganPizza;
                break;
            }
            case MARGARITA -> {
                PizzaMargarita margaritaPizza = new PizzaMargarita();
                rezalt = margaritaPizza;
                break;
            }
            case AUTHOR -> {
                Pizza autorPizza = new PizzaAutor();
                rezalt = autorPizza;
                break;
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        return rezalt;
    }

    @Override
    public Pizza addIngredients(Pizza pizza, Ingredient[] additionalIngredients) {
        Ingredient[] baseIngredient = pizza.getIngredients();
        int size = baseIngredient.length + additionalIngredients.length;
        Ingredient[] newIngredient = new Ingredient[size];
        int i = 0;
        for(int j = 0; j < additionalIngredients.length; j++){
            newIngredient[i] = additionalIngredients[j];
            i++;
        }
        for(int j = 0; j < baseIngredient.length; j++){
            newIngredient[i] = baseIngredient[j];
            i++;
        }
        pizza.setIngredients(newIngredient);
        pizza.setName(pizza.getName() + "*");
        pizza.costPizza();
        return pizza;
    }

    @Override
    public Ingredient[] getBaseIngredients() {
        Ingredient[] ingredients = new Ingredient[3];
        ingredients[0] = new Ingredient("Тесто", 50, 100);
        ingredients[1] = new Ingredient("Сыр", 50, 100);
        ingredients[2] = new Ingredient("Соус", 50, 50);
        return ingredients;
    }
}
