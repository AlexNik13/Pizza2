package Pizza3.pizza;

import Pizza3.PizzaType;
import Pizza3.ingredients.Ingredient;

import java.util.Scanner;

public abstract class Pizza {
    private PizzaType type;
    private String name;
    private double costPizza;
    private Ingredient[] ingredients = new Ingredient[3];

    Scanner in = new Scanner(System.in);

    Pizza(String name){
        this.name = name;
        ingredients = getBaseIngredients();
    }



    public String getName() {
        return name;
    }




    public double getCost() {
        return costPizza;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }



    public double costPizza(){
        costPizza = 0;
        for(int i = 0; i < ingredients.length; i++){
            costPizza += (ingredients[i].getCost() / 1000) * ingredients[i].getQuantity();
        }
        return (double) Math.round(costPizza * 100) / 100;
    }


    public Ingredient[] getBaseIngredients() {
        Ingredient[] ingredients = new Ingredient[3];
        ingredients[0] = new Ingredient("Тесто", 50, 100);
        ingredients[1] = new Ingredient("Сыр", 50, 100);
        ingredients[2] = new Ingredient("Соус", 50, 50);
        return ingredients;
    }

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }
}
