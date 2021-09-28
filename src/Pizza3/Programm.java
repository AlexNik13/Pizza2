package Pizza3;

import Pizza3.ingredients.Ingredient;
import Pizza3.ingredients.NameIngredient;
import Pizza3.pizza.Pizza;
import Pizza3.pizza.PizzaMeat;

public class Programm {

    public static void main(String[] args) {
        /*Pizza pz = new PizzaMeat();
        System.out.println(pz.getName());
        System.out.println(pz.getCost());
        System.out.println(pz.costPizza());*/

        /*System.out.println(NameIngredient.values().length);

        NameIngredient[] ingredients = NameIngredient.values();

        for (NameIngredient item : ingredients){
            System.out.print(item);
            System.out.println(item.getCost());
        }*/
       // Ingredient ingredient = new Ingredient();

//Проверка создания пиццы
        /*MyPizzaria pizzeria = new MyPizzaria();
        Pizza pizza = pizzeria.createPizza(PizzaType.MEAT);
        System.out.println(pizza);
        System.out.println(pizza.getCost());

        Ingredient[] ingredients = pizza.getIngredients();
        System.out.println(ingredients.length);
        for (int i = 0; i < ingredients.length; i++){
            System.out.println(ingredients[i].getName() + " " + ingredients[i].getCost() + " " + ingredients[i].getQuantity());

        }*/
        /*MyPizzaria pizzaria = new MyPizzaria();
        Pizza[] pizza = new Pizza[1];
        //pizza[0] = new PizzaMeat();
        pizza[0] = pizzaria.createPizza(PizzaType.MEAT);*/


        Order order = new Order();
    }
}
